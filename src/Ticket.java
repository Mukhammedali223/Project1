class Ticket {
    int ticketId;
    Commuter commuter;
    Bus bus;
    public Ticket(int ticketId, Commuter commuter, Bus bus) {
        this.ticketId = ticketId;
        this.commuter = commuter;
        this.bus = bus;
    }
    public Bus getBus() {
        return bus;
    }
    public String toString() {
        return "Билет(ID=" + ticketId + ", Пассажир=" + commuter.name + ", Автобус=" + bus.routeNum + ")";
    }
}