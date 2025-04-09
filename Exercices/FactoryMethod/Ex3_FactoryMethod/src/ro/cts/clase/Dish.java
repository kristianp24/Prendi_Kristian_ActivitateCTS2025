package ro.cts.clase;

public abstract class Dish {
    private float price;
    private int preparationTime;

    public Dish(float price, int preparationTime) {
        this.price = price;
        this.preparationTime = preparationTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dish{");
        sb.append("price=").append(price);
        sb.append(", preparationTime=").append(preparationTime);
        sb.append('}');
        return sb.toString();
    }
}
