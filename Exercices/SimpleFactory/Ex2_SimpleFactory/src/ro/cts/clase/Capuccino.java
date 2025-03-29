package ro.cts.clase;

public class Capuccino extends Coffees{
    public Capuccino(String tipulDeCafeaua, int gramaj, int pret) {
        super(tipulDeCafeaua, gramaj, pret);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Capuccino{");
        sb.append("tipulDeCafeaua='").append(tipulDeCafeaua).append('\'');
        sb.append(", gramaj=").append(gramaj);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
