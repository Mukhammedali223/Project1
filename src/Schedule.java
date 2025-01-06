class Schedule {
    Bus bus;
    int[] depTimes;

    public Schedule(Bus bus, int[] depTimes) {
        this.bus = bus;
        this.depTimes = depTimes;
    }

    public int[] getDepTimes() {
        return depTimes;
    }

    public String toString() {
        String scheduleString = "[";
        for (int i = 0; i < depTimes.length; i++) {
            scheduleString += String.format("%04d", depTimes[i]);
            if (i < depTimes.length - 1) {
                scheduleString += ", ";
            }
        }
        scheduleString += "]";
        return scheduleString;
    }
}