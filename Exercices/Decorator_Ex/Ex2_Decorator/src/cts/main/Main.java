package cts.main;

import cts.clase.DecoratorCraciun;
import cts.clase.DecoratorRevelion;
import cts.clase.Printer;
import cts.clase.PrinterBiletAutobuz;

public class Main {
    public static void main(String[] args) {
        Printer biletAutobuz = new PrinterBiletAutobuz("Bilet de autobuz, Linia 123.");
        Printer decoratorRevelion = new DecoratorRevelion(biletAutobuz);
        decoratorRevelion.printeazaBilet();

        Printer decoratorCraciun = new DecoratorCraciun(biletAutobuz);
        decoratorCraciun.printeazaBilet();
    }
}