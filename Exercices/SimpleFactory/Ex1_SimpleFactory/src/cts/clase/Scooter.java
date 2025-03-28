package cts.clase;

public class Scooter extends Vehicle{

    public Scooter(float pret, String culoare) {
        super(pret, culoare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Scooter{");
        sb.append("pret=").append(pret);
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append(", rata=").append(rata);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void calculeazaRata() {
        float rataPeLuna = (float) (pret / 12 + ((pret / 12) * 0.1));
        setRata(rataPeLuna);
    }
}
