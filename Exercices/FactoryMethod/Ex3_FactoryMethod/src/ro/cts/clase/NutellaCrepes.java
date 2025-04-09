package ro.cts.clase;

public class NutellaCrepes extends Dish{

    public NutellaCrepes(float price, int preparationTime) {
        super(price, preparationTime);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NutellaCrepes{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
