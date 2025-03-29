package ro.cts.main;

import ro.cts.clase.Coffees;
import ro.cts.factory.CofeeTypes;
import ro.cts.factory.CoffeeFactory;

public class Main {
    public static void main(String[] args) {
        CoffeeFactory factory = new CoffeeFactory("Lavazza");
        Coffees esspreso = factory.getProdus(CofeeTypes.ESPRESSO, "faraAroma", "scurt");
        Coffees latte = factory.getProdus(CofeeTypes.LATTE, "Caramel Sarat", "Nu e esspreso");
        Coffees cappucino = factory.getProdus(CofeeTypes.CAPUCCINO, "Caramel dulce",null);
        System.out.println(esspreso);
        System.out.println(latte);
        System.out.println(cappucino);
    }
}