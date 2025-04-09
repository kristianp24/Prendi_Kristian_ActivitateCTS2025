package ro.cts.factory;

import ro.cts.clase.Dish;

public interface AbstractFactory {
    public Dish getDish (Types type, boolean isSpicy, boolean isSmall);
}
