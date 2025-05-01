package ro.cts.main;

import ro.cts.clase.CarWash;
import ro.cts.clase.Wash;
import ro.cts.clase.WaxDecorator;

public class Main {
    public static void main(String[] args) {
        Wash carWash = new CarWash(1, 20);
        Wash waxWash = new WaxDecorator(carWash);
        waxWash.showDescription();
    }
}