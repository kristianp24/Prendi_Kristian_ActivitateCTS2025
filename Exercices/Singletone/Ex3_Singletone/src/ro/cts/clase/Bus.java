package ro.cts.clase;

public class Bus {
    private int busId;
    private int numberOfStops;
    private int capacity;

    private String driverName;

    public Bus(int busId, int numberOfStops, int capacity, String driverName) {
        this.busId = busId;
        this.numberOfStops = numberOfStops;
        this.capacity = capacity;
        this.driverName = driverName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bus{");
        sb.append("busId=").append(busId);
        sb.append(", numberOfStops=").append(numberOfStops);
        sb.append(", capacity=").append(capacity);
        sb.append(", driverName='").append(driverName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
