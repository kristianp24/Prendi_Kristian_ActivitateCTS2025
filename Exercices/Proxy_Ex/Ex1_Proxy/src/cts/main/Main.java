package cts.main;

import cts.clase.Internare;
import cts.clase.InternarePacient;
import cts.clase.ProxyAsigurare;

public class Main {
    public static void main(String[] args) {
        Internare internare = new InternarePacient();

        Internare proxy = new ProxyAsigurare(internare);
        proxy.internarePacient(true);
        proxy.internarePacient(false);
    }
}