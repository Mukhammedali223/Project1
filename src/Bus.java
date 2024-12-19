public class Bus {
    private String routeNumber;
    private int capacity;
    private int passengerCount;
    public Bus(String routeNumber, int capacity) {
        this.routeNumber = routeNumber;
        this.capacity = capacity;
        this.passengerCount = 0;
    }
    public String getRouteNumber() {
        return routeNumber;
    }
    public void setRouteNumber(String routeNumber) {
        this.routeNumber = routeNumber;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getPassengerCount() {
        return passengerCount;
    }
    public void setPassengerCount(int passengerCount) {
        if (passengerCount <= capacity) {
            this.passengerCount = passengerCount;}
        else {
            System.out.println("Автобус полный");
        }
    }
    public String toString() {
        return "Автобус(" +
                "Номер='" + routeNumber + '\'' +
                ", вместимость=" + capacity +
                ", количество пассажиров=" + passengerCount +
                ')';
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Bus bus = (Bus) obj;
        return capacity == bus.capacity && passengerCount == bus.passengerCount && routeNumber.equals(bus.routeNumber);
    }
}