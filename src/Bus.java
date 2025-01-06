class Bus {
    String routeNum;
    int capacity;
    int passCount;
    Schedule schedule;
    public Bus(String routeNum, int capacity) {
        this.routeNum = routeNum;
        this.capacity = capacity;
        this.passCount = 0;
    }
    public void setPassCount(int passCount) {
        if (passCount <= capacity) {
            this.passCount = passCount;
        } else {
            System.out.println("Автобус полный");
        }
    }
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
    public String getRouteNum() {
        return routeNum;
    }
    public Schedule getSchedule() {
        return schedule;
    }
    public String toString() {
        return "Автобус(Номер='" + routeNum + '\'' +
                ", вместимость=" + capacity +
                ", количество пассажиров=" + passCount +
                (schedule != null ? ", расписание: " + schedule : "") +
                ')';
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Bus bus = (Bus) obj;
        return capacity == bus.capacity && routeNum.equals(bus.routeNum);
    }
}