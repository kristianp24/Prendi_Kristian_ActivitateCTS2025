package ro.cts.clase;

public abstract class Vehicle {
    protected float pret;
    protected String culoare;
    protected float rata;

    protected void setRata(float rata) {
        this.rata = rata;
    }

    public Vehicle(float pret, String culoare) {
        this.pret = pret;
        this.culoare = culoare;
    }

    public abstract void calculeazaRata();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehicle{");
        sb.append("pret=").append(pret);
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append(", rata= ").append(rata).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
