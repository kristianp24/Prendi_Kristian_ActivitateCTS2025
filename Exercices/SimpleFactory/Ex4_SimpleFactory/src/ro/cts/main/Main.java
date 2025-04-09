package ro.cts.main;

import ro.cts.clase.Cocktail;
import ro.cts.factory.CocktailsFactory;
import ro.cts.factory.CocktailsType;

public class Main {
    public static void main(String[] args) {
        CocktailsFactory factory = new CocktailsFactory(40, 10);
        Cocktail mojito = factory.getCocktail(CocktailsType.MOJITO, "Gin Hendricks", false);
        Cocktail margarita = factory.getCocktail(CocktailsType.MARGARITA, "Rom", true);

        System.out.println(mojito);
        System.out.println(margarita);
    }
}