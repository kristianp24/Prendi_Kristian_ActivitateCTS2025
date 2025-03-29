package ro.cts.clase;

public class SweetCreepes extends BakeryProducts {
    private boolean containsBanana;
    private boolean containsNutella;

    private boolean containsBiscuits;

    public SweetCreepes(float price, int quantityInGrams, boolean containsBanana, boolean containsNutella, boolean containsBiscuits) {
        super(price, quantityInGrams);
        this.containsBanana = containsBanana;
        this.containsNutella = containsNutella;
        this.containsBiscuits = containsBiscuits;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SweetCreepes{");
        sb.append("containsBanana=").append(containsBanana);
        sb.append(", containsNutella=").append(containsNutella);
        sb.append(", containsBiscuits=").append(containsBiscuits);
        sb.append(", price=").append(price);
        sb.append(", quantityInGrams=").append(quantityInGrams);
        sb.append('}');
        return sb.toString();
    }
}
