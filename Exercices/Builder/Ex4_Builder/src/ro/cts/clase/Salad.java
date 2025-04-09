package ro.cts.clase;

public class Salad {
    private boolean containsTomato;
    private boolean containsPotato;
    private boolean containsCabbage;

    private boolean containsChicken;
    private boolean containsBeef;
    private boolean containsAvocado;

    private boolean containsSoia;

    public Salad(boolean containsTomato, boolean containsPotato, boolean containsCabbage, boolean containsChicken, boolean containsBeef, boolean containsAvocado, boolean containsSoia) {
        this.containsTomato = containsTomato;
        this.containsPotato = containsPotato;
        this.containsCabbage = containsCabbage;
        this.containsChicken = containsChicken;
        this.containsBeef = containsBeef;
        this.containsAvocado = containsAvocado;
        this.containsSoia = containsSoia;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Salad{");
        sb.append("containsTomato=").append(containsTomato);
        sb.append(", containsPotato=").append(containsPotato);
        sb.append(", containsCabbage=").append(containsCabbage);
        sb.append(", containsChicken=").append(containsChicken);
        sb.append(", containsBeef=").append(containsBeef);
        sb.append(", containsAvocado=").append(containsAvocado);
        sb.append(", containsSoia=").append(containsSoia);
        sb.append('}');
        return sb.toString();
    }
}
