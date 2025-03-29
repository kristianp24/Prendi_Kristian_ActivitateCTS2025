package ro.cts.clase;

public abstract class Coffees {
    protected String tipulDeCafeaua;
    protected int gramaj;
    protected int pret;

    public Coffees(String tipulDeCafeaua, int gramaj, int pret) {
        this.tipulDeCafeaua = tipulDeCafeaua;
        this.gramaj = gramaj;
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Coffees{");
        sb.append("tipulDeCafeaua='").append(tipulDeCafeaua).append('\'');
        sb.append(", gramaj=").append(gramaj);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
