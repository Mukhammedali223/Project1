class TransportService {
    private Bus[] buses;
    private int busCount;
    private Ticket[] tickets;
    private int ticketCount;
    public TransportService(int m) {
        this.buses = new Bus[m];
        this.tickets = new Ticket[100]; // Максимум 100 билетов
        this.busCount = 0;
        this.ticketCount = 0;
    }
    public void addBus(Bus bus) {
        if (busCount < buses.length) {
            buses[busCount] = bus;
            busCount++;
        } else {
            System.out.println("Максимальное количество автобусов");
        }
    }
    public void addTicket(Ticket ticket) {
        if (ticketCount < tickets.length) {
            tickets[ticketCount] = ticket;
            ticketCount++;
        } else {
            System.out.println("Достигнут лимит билетов");
        }
    }
    public void displayBuses() {
        if (busCount == 0) {
            System.out.println("Автобусы отсутствуют");
            return;
        }
        System.out.println("Информация об автобусах:");
        for (int i = 0; i < busCount; i++) {
            System.out.println(buses[i]);
        }
    }
    public Bus findBus(String routeNum) {
        for (int i = 0; i < busCount; i++) {
            if (buses[i].getRouteNum().equals(routeNum)) {
                return buses[i];
            }
        }
        return null;
    }
    public int[] getSchedule(Bus bus) {
        if (bus != null && bus.getSchedule() != null) {
            return bus.getSchedule().getDepTimes();
        }
        return null;
    }
}