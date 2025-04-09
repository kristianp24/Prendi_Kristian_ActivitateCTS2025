package ro.cts.clase;

public abstract class Cocktail {
    protected int alcoholMl;
    protected int preparationTimeMinutes;
    protected boolean containsIce;

    protected String alcoholType;

    public Cocktail(int alcoholMl, int preparationTimeMinutes, boolean containsIce, String alcoholType) {
        this.alcoholMl = alcoholMl;
        this.preparationTimeMinutes = preparationTimeMinutes;
        this.containsIce = containsIce;
        this.alcoholType = alcoholType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("alcoholMl=").append(alcoholMl);
        sb.append(", preparationTimeMinutes=").append(preparationTimeMinutes);
        sb.append(", containsIce=").append(containsIce);
        sb.append(", alcoholType='").append(alcoholType).append('\'');
        return sb.toString();
    }
}
