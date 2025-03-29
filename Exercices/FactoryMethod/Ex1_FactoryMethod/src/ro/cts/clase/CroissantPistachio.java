package ro.cts.clase;

public class CroissantPistachio extends BakeryProducts {
    public CroissantPistachio(float price, int quantityInGrams) {
        super(price, quantityInGrams);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CroissantPistachio{");
        sb.append("price=").append(price);
        sb.append(", quantityInGrams=").append(quantityInGrams);
        sb.append('}');
        return sb.toString();
    }
}
