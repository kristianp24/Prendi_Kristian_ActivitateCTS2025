package ro.cts.clase;

public class Pepperoni extends Dish{
    private boolean containsSpicySalam;

    public Pepperoni(float price, int preparationTime, boolean containsSpicySalam) {
        super(price, preparationTime);
        this.containsSpicySalam = containsSpicySalam;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pepperoni{");
        sb.append(super.toString());
        sb.append("containsSpicySalam=").append(containsSpicySalam);
        sb.append('}');
        return sb.toString();
    }
}
