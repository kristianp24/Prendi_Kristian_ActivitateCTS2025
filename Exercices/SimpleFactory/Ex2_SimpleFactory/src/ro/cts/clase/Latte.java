package ro.cts.clase;

public class Latte extends Coffees{
    private String aroma;

    public Latte(String tipulDeCafeaua, int gramaj, int pret, String aroma) {
        super(tipulDeCafeaua, gramaj, pret);
        this.aroma = aroma;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Latte{");
        sb.append("aroma='").append(aroma).append('\'');
        sb.append(", tipulDeCafeaua='").append(tipulDeCafeaua).append('\'');
        sb.append(", gramaj=").append(gramaj);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
