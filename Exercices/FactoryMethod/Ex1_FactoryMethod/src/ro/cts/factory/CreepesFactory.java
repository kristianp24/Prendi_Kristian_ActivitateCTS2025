package ro.cts.factory;

import ro.cts.clase.BakeryProducts;
import ro.cts.clase.SaltyCreepes;
import ro.cts.clase.SweetCreepes;

public class CreepesFactory extends AbstractFactory{
    private boolean containsBacon;
    private boolean containsCheese;
    private boolean containsPhiladelphia;

    private boolean containsBanana;
    private boolean containsNutella;

    private boolean containsBiscuits;

    public CreepesFactory(int price, int quantity, boolean containsBacon, boolean containsCheese, boolean containsPhiladelphia) {
        super(price, quantity);
        this.containsBacon = containsBacon;
        this.containsCheese = containsCheese;
        this.containsPhiladelphia = containsPhiladelphia;

    }

    public CreepesFactory(boolean containsBanana, boolean containsNutella, boolean containsBiscuits, int price, int quantity) {
        super(price, quantity);
        this.containsBanana = containsBanana;
        this.containsNutella = containsNutella;
        this.containsBiscuits = containsBiscuits;
    }


    @Override
    public BakeryProducts getProducts(Types types) {
        switch ((CreepesTypes) types){
            case SWEET -> {
                return new SweetCreepes(price, quantity, containsBanana, containsNutella, containsBiscuits);
            }
            case SALTY -> {
                return new SaltyCreepes(price, quantity, containsBacon, containsCheese, containsPhiladelphia);
            }
            case null, default -> {
                return null;
            }
        }

    }
}
