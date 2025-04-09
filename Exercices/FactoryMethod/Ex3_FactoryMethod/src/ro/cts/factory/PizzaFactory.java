package ro.cts.factory;

import ro.cts.clase.Dish;
import ro.cts.clase.Margarita;
import ro.cts.clase.Pepperoni;

public class PizzaFactory implements AbstractFactory{

    private float price;
    private int preparationTime;

    public PizzaFactory(float price, int preparationTime) {
        this.price = price;
        this.preparationTime = preparationTime;
    }

    @Override
    public Dish getDish(Types type, boolean isSpicy, boolean isSmall) {
       switch ((PizzaType) type){
           case MARGARITA -> {
               return new Margarita(this.price, this.preparationTime, isSmall);
           }
           case PEPPERONI -> {
               return new Pepperoni(this.price, this.preparationTime, isSpicy);
           }
           case null, default -> {
               return null;
           }
       }
    }
}
