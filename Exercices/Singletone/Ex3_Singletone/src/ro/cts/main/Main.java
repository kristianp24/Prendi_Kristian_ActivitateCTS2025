package ro.cts.main;

import ro.cts.clase.Bus;
import ro.cts.clase.ControlCenter;

public class Main {
    public static void main(String[] args) {
        ControlCenter controlCenter = ControlCenter.getInstance();

        controlCenter.adaugaLinie("Linia 123", new Bus(056, 20, 50, "Mihai Popescu"));
        controlCenter.adaugaLinie("Linia 135", new Bus(149, 30, 45, "Gigel popescu"));

        System.out.println(controlCenter);

        controlCenter.stergeLinia("Linia 123");

        System.out.println(controlCenter);
    }
}