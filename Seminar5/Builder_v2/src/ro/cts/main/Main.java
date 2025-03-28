package ro.cts.main;

import ro.cts.clase.Rezervare;
import ro.cts.clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {

        RezervareBuilder builder = new RezervareBuilder("Kristian");
        builder.setGenMuzica("Clasica").setHasMasaDecorata(true).setHasScauneErg(true);
        Rezervare rezervare = builder.build();
        System.out.println(rezervare);
    }
}