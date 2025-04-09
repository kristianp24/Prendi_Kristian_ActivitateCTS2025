package ro.cts.clase;

public class Mojito extends Cocktail{

    public Mojito(int alcoholMl, int preparationTimeMinutes, boolean containsIce, String alcoholType) {
        super(alcoholMl, preparationTimeMinutes, containsIce, alcoholType);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mojito {");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
