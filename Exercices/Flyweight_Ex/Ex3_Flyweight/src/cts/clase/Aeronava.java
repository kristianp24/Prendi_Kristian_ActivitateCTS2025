package cts.clase;

public class Aeronava implements IAeronava{
    private String tip;
    private String model;
    private int nrLocuri;
    private int anProducere;

    public Aeronava(String tip, String model, int nrLocuri, int anProducere) {
        this.tip = tip;
        this.model = model;
        this.nrLocuri = nrLocuri;
        this.anProducere = anProducere;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Aeronava{");
        sb.append("tip='").append(tip).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append(", anProducere=").append(anProducere);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaAvion(Zbor zbor) {
        System.out.println(this + " are zborul: "+ zbor);
    }
}
