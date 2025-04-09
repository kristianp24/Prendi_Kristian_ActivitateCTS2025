package ro.cts.clase;

public class Margarita extends Dish{
    private boolean isSmall;

    public Margarita(float price, int preparationTime, boolean isSmall) {
        super(price, preparationTime);
        this.isSmall = isSmall;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Margarita{");
        sb.append(super.toString());
        sb.append("isSmall=").append(isSmall);
        sb.append('}');
        return sb.toString();
    }
}
