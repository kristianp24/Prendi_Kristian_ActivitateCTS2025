package ro.cts.clase;

public abstract class BakeryProducts {
    protected float price;
    protected int quantityInGrams;

    public BakeryProducts(float price, int quantityInGrams) {
        this.price = price;
        this.quantityInGrams = quantityInGrams;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BakeryProducts{");
        sb.append("price=").append(price);
        sb.append(", quantityInGrams=").append(quantityInGrams);
        sb.append('}');
        return sb.toString();
    }
}
