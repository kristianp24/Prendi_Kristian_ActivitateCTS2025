package ro.cts.clase;

public class BookingBuilder implements AbstractBuilder{

    private boolean hasBreakfast;
    private boolean hasSeaView;
    private boolean hasExtraBed;
    private boolean hasAirportPickup;

    public BookingBuilder(){
        this.hasBreakfast = false;
        this.hasAirportPickup = false;
        this.hasExtraBed = false;
        this.hasSeaView = false;
    }

    public BookingBuilder setHasBreakfast(boolean hasBreakfast) {
        this.hasBreakfast = hasBreakfast;
        return this;
    }

    public BookingBuilder setHasSeaView(boolean hasSeaView) {
        this.hasSeaView = hasSeaView;
        return this;
    }

    public BookingBuilder setHasExtraBed(boolean hasExtraBed) {
        this.hasExtraBed = hasExtraBed;
        return this;
    }

    public BookingBuilder setHasAirportPickup(boolean hasAirportPickup) {
        this.hasAirportPickup = hasAirportPickup;
        return this;
    }

    @Override
    public Booking build() {
        return new Booking(hasBreakfast, hasSeaView, hasExtraBed, hasAirportPickup);
    }
}
