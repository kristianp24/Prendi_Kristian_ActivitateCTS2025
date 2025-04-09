package ro.cts.main;

import ro.cts.clase.Salad;
import ro.cts.clase.SaladBuilder;

public class Main {
    public static void main(String[] args) {
        SaladBuilder saladBuilder = new SaladBuilder();
        saladBuilder.setContainsBeef(true).setContainsPotato(true).setContainsCabbage(true);
        Salad salad = saladBuilder.build();

        saladBuilder.setContainsAvocado(true).setContainsAvocado(true);
        Salad salad1 = saladBuilder.build();

        System.out.println(salad);
        System.out.println(salad1);

    }
}