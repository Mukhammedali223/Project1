public class Main {
    public static void main(String[] args) {
        Bus b1 = new Bus("15", 40);
        Bus b2 = new Bus("51", 55);
        b1.setPassCount(28);
        b2.setPassCount(53);
        Commuter c1 = new Commuter("Амирхан", "Экспо");
        Commuter c2 = new Commuter("Ерлан", "Дом Министерств");
        TransportService service = new TransportService(5);
        service.addBus(b1);
        service.addBus(b2);
        int[] depTimes1 = {800, 900, 1000};
        Schedule s1 = new Schedule(b1, depTimes1);
        b1.setSchedule(s1);
        int[] depTimes2 = {930, 1030, 1130};
        Schedule s2 = new Schedule(b2, depTimes2);
        b2.setSchedule(s2);
        Ticket t1 = new Ticket(1, c1, b1);
        Ticket t2 = new Ticket(2, c2, b2);
        Ticket t3 = new Ticket(3, c1, b1);
        service.addTicket(t1);
        service.addTicket(t2);
        service.addTicket(t3);
        service.displayBuses();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        Bus foundBus = service.findBus("51");
        if (foundBus != null) {
            System.out.println("\nНайден автобус: " + foundBus);
        } else {
            System.out.println("\nАвтобус не найден");
        }
        int[] schedule = service.getSchedule(b1);
        if (schedule != null) {
            System.out.print("\nРасписание для автобуса " + b1.routeNum + ": ");
            for (int time : schedule) System.out.print(String.format("%04d", time) + " ");
            System.out.println();
        } else {
            System.out.println("\nРасписание автобуса не найдено");
        }
    }
}