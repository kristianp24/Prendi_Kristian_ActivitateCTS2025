package ro.cts.main;

import ro.cts.clase.CovidRoomConfiguration;
import ro.cts.clase.RoomConfiguration;

public class Main {
    public static void main(String[] args) {
        RoomConfiguration covidRoom = new CovidRoomConfiguration("single Bed", true, true, true, true, 5);
        RoomConfiguration covidRoom2 = covidRoom.copiaza();
        covidRoom2.setBedType("double");

        System.out.println(covidRoom);
        System.out.println(covidRoom2);

    }
}