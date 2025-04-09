package ro.cts.clase;

public class PinaColada extends Cocktail{

    public PinaColada(int alcoholMl, int preparationTimeMinutes, boolean containsIce, String alcoholType) {
        super(alcoholMl, preparationTimeMinutes, containsIce, alcoholType);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PinaColada{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
