package ro.cts.clase;

public class SaltyCreepes extends BakeryProducts {
    private boolean containsBacon;
    private boolean containsCheese;
    private boolean containsPhiladelphia;

    public SaltyCreepes(float price, int quantityInGrams, boolean containsBacon, boolean containsCheese, boolean containsPhiladelphia) {
        super(price, quantityInGrams);
        this.containsBacon = containsBacon;
        this.containsCheese = containsCheese;
        this.containsPhiladelphia = containsPhiladelphia;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SaltyCreepes{");
        sb.append("containsBacon=").append(containsBacon);
        sb.append(", containsCheese=").append(containsCheese);
        sb.append(", containsPhiladelphia=").append(containsPhiladelphia);
        sb.append(", price=").append(price);
        sb.append(", quantityInGrams=").append(quantityInGrams);
        sb.append('}');
        return sb.toString();
    }
}
