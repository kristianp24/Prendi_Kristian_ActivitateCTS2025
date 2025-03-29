package ro.cts.clase;

public class CroissantNutella extends BakeryProducts {
    private String tipNutella;

    public CroissantNutella(float price, int quantityInGrams, String tipNutella) {
        super(price, quantityInGrams);
        this.tipNutella = tipNutella;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CroissantNutella{");
        sb.append("tipNutella='").append(tipNutella).append('\'');
        sb.append(", price=").append(price);
        sb.append(", quantityInGrams=").append(quantityInGrams);
        sb.append('}');
        return sb.toString();
    }
}
