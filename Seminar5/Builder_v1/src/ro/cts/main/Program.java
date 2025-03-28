package ro.cts.main;

import ro.cts.clase.Rezervare;
import ro.cts.clase.RezervareBuilder;

public class Program {
    public static void main(String[] args) {
        RezervareBuilder builder = new RezervareBuilder();
        builder.setGenMuzica("clasica").setHasMasaDecorata(true);
        Rezervare rez = builder.build("Kristian Prendi");
        System.out.println(rez);
    }
}
