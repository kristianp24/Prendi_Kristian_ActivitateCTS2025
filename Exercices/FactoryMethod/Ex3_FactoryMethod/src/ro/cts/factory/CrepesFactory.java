package ro.cts.factory;

import ro.cts.clase.BiscuitCrepe;
import ro.cts.clase.Dish;
import ro.cts.clase.NutellaCrepes;

public class CrepesFactory implements AbstractFactory{
    private float price;
    private int preparationTime;

    public CrepesFactory(float price, int preparationTime) {
        this.price = price;
        this.preparationTime = preparationTime;
    }

    @Override
    public Dish getDish(Types type, boolean isSpicy, boolean isSmall) {
        switch ((CrepesType) type){
            case NUTELLA -> {
                return new NutellaCrepes(this.price, this.preparationTime);
            }
            case BISCUITS -> {
                return new BiscuitCrepe(this.price, this.preparationTime);
            }
            case null, default -> {
                return null;
            }
        }
    }
}
