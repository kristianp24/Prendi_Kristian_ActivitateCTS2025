package ro.cts.clase;

public class Margarita extends Cocktail{

    public Margarita(int alcoholMl, int preparationTimeMinutes, boolean containsIce, String alcoholType) {
        super(alcoholMl, preparationTimeMinutes, containsIce, alcoholType);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Margarita{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
