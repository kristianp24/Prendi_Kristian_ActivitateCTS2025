package ro.cts.main;

import ro.cts.clase.BakeryProducts;
import ro.cts.factory.CreepesFactory;
import ro.cts.factory.CreepesTypes;
import ro.cts.factory.CroissantFactory;
import ro.cts.factory.CroissantsTypes;

public class Main {
    public static void main(String[] args) {
        CroissantFactory croissantFactory  = new CroissantFactory(20, 150, "Black");
        CreepesFactory saltyCreepesFactory = new CreepesFactory(30, 200, true, true, false);
        CreepesFactory sweetCreepesFactory = new CreepesFactory(true, true, true, 31, 210);

        BakeryProducts nutellaCroissant = croissantFactory.getProducts(CroissantsTypes.NUTELLA);
        BakeryProducts saltyCreepe = saltyCreepesFactory.getProducts(CreepesTypes.SALTY);
        BakeryProducts sweetCreepe = sweetCreepesFactory.getProducts(CreepesTypes.SWEET);

        System.out.println(nutellaCroissant);
        System.out.println(saltyCreepe);
        System.out.println(sweetCreepe);

    }
}