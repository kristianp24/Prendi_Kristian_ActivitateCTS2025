package ro.cts.main;

import ro.cts.clase.Booking;
import ro.cts.clase.BookingBuilder;

public class Main {
    public static void main(String[] args) {
        BookingBuilder bookingBuilder = new BookingBuilder();
        bookingBuilder.setHasBreakfast(true).setHasSeaView(true);
        Booking booking1 = bookingBuilder.build();

        bookingBuilder.setHasBreakfast(false).setHasExtraBed(true).setHasSeaView(false);
        Booking booking2 = bookingBuilder.build();

        System.out.println(booking1);
        System.out.println(booking2);
    }
}