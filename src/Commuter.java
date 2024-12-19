public class Commuter {
    private String name;
    private String destination;
    public Commuter(String name, String destination) {
        this.name = name;
        this.destination = destination;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public String toString() {
        return "Пассажир(" +
                "Имя=" + name +
                ", Место=" + destination +
                ')';
    }
}