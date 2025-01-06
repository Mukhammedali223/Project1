class Commuter {
    String name;
    String destination;
    public Commuter(String name, String destination) {
        this.name = name;
        this.destination = destination;
    }
    public String toString() {
        return "Пассажир(Имя=" + name + ", Место=" + destination + ')';
    }
}