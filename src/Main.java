public class Main {
    public static void main(String[] a) {
        Bus bus1 = new Bus("15", 40);
        Bus bus2 = new Bus("51", 55);
        bus1.setPassengerCount(28);
        bus2.setPassengerCount(53);
        Commuter commuter1 = new Commuter("Амирхан", "Экспо");
        Commuter commuter2 = new Commuter("Ерлан", "Дом Министерств");
        TransportService service = new TransportService(5);
        service.addBus(bus1);
        service.addBus(bus2);
        service.displayBuses();
        System.out.println(commuter1);
        System.out.println(commuter2);
        System.out.println("bus1 equals bus2? " + bus1.equals(bus2));
    }
}