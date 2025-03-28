package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args){
        FactorySupa factorySupa = new FactorySupa(500);
        FactoryDesert factoryDesert = new FactoryDesert("vanilla");

        FelDeMancare supaLegume = factorySupa.creareFelDeMancare(Supe.SUPELEGUME, 25, 200);
        factorySupa.setCantitate(599);
        FelDeMancare supaCiuperci = factorySupa.creareFelDeMancare(Supe.SUPECIUPERCI, 25, 205);
        FelDeMancare tiramisu = factoryDesert.creareFelDeMancare(Desert.TIRAMISU, 30, 150);
        System.out.println(supaCiuperci);
        System.out.println(tiramisu);

    }
}
