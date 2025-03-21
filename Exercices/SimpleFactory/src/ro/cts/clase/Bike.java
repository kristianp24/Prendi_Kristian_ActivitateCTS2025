package ro.cts.clase;

public class Bike extends Vehicle{
    private boolean isElectric;

    public Bike(float pret, String culoare, boolean isElectric) {
        super(pret, culoare);
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bike{");
        sb.append("isElectric=").append(isElectric);
        sb.append(", pret=").append(pret);
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append(", rata=").append(rata);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void calculeazaRata() {
        float rataPeLuna = (float) (pret / 12 + ((pret / 12) * 0.05));
        setRata(rataPeLuna);
    }
}
