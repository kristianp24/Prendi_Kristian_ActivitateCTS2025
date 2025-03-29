package ro.cts.factory;

import ro.cts.clase.BakeryProducts;

public abstract class AbstractFactory {
    protected int price;
    protected int quantity;

    public AbstractFactory(int price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractFactory{");
        sb.append("price=").append(price);
        sb.append(", quantity=").append(quantity);
        sb.append('}');
        return sb.toString();
    }

    public abstract BakeryProducts getProducts (Types types);
}
