package cts.main;

import cts.clase.FabricaAeronave;
import cts.clase.IAeronava;
import cts.clase.Zbor;

public class Main {
    public static void main(String[] args) {
        Zbor zbor1 = new Zbor("Bucuresti", "Tirana", "20/05/2025");
        FabricaAeronave fabricaAeronave = new FabricaAeronave("Fabrica");

        IAeronava aeronava = fabricaAeronave.getAeronava("Tip1", "Boeing7785", 250,2009);
        aeronava.afiseazaAvion(zbor1);
    }
}