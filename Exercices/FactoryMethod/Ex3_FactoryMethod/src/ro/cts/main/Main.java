package ro.cts.main;

import ro.cts.clase.Dish;
import ro.cts.clase.Margarita;
import ro.cts.factory.CrepesFactory;
import ro.cts.factory.CrepesType;
import ro.cts.factory.PizzaFactory;
import ro.cts.factory.PizzaType;

public class Main {
    public static void main(String[] args) {

        PizzaFactory pizzaFactory = new PizzaFactory(50, 25);
        CrepesFactory crepesFactory = new CrepesFactory(20, 5);
        Dish pizzaMargarita = pizzaFactory.getDish(PizzaType.MARGARITA, false, false);
        Dish nutellaCrepes = crepesFactory.getDish(CrepesType.NUTELLA, false, false);

        System.out.println(pizzaMargarita);
        System.out.println(nutellaCrepes);
    }
}