package ro.cts.clase;

public class Booking {
    private boolean hasBreakfast;
    private boolean hasSeaView;
    private boolean hasExtraBed;
    private boolean hasAirportPickup;

    public Booking(boolean hasBreakfast, boolean hasSeaView, boolean hasExtraBed, boolean hasAirportPickup) {
        this.hasBreakfast = hasBreakfast;
        this.hasSeaView = hasSeaView;
        this.hasExtraBed = hasExtraBed;
        this.hasAirportPickup = hasAirportPickup;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Booking{");
        sb.append("hasBreakfast=").append(hasBreakfast);
        sb.append(", hasSeaView=").append(hasSeaView);
        sb.append(", hasExtraBed=").append(hasExtraBed);
        sb.append(", hasAirportPickup=").append(hasAirportPickup);
        sb.append('}');
        return sb.toString();
    }


}
