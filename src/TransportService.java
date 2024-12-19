public class TransportService {
    private Bus[] buses;
    private int busCount;
    public TransportService(int m) {
        this.buses = new Bus[m];
        this.busCount = 0;
    }
    public void addBus(Bus bus) {
        if (busCount < buses.length) {
            buses[busCount] = bus;
            busCount++;
        } else {
            System.out.println("максимальное количество автобусов");
        }
    }
    public Bus[] getBuses() {
        return buses;
    }
    public void setBuses(Bus[] buses) {
        this.buses = buses;
        this.busCount = buses.length;
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
}