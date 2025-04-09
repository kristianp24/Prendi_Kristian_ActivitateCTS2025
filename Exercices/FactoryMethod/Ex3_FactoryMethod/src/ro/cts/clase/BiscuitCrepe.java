package ro.cts.clase;

public class BiscuitCrepe extends Dish{

    public BiscuitCrepe(float price, int preparationTime) {
        super(price, preparationTime);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BiscuitCrepe{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
