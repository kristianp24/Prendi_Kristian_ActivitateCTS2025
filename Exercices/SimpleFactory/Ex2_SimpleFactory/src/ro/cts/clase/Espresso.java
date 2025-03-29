package ro.cts.clase;

public class Espresso extends Coffees{
    private String tipul;

    public Espresso(String tipulDeCafeaua, int gramaj, int pret, String tipul) {
        super(tipulDeCafeaua, gramaj, pret);
        this.tipul = tipul;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Espresso{");
        sb.append("tipul='").append(tipul).append('\'');
        sb.append(", gramaj=").append(gramaj);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
