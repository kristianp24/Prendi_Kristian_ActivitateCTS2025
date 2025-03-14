package ro.cts.registry;

public class Reglementare {
    private String model;
    private String dataRegelementare;
    private int nrRegelementare;

    protected Reglementare(String model, String dataRegelementare, int nr) {
        this.model = model;
        this.dataRegelementare = dataRegelementare;
        this.nrRegelementare = nr;
    }

    @Override
    public String toString() {
        return "Reglementare{" +
                "model='" + model + '\'' +
                ", dataRegelementare='" + dataRegelementare + '\'' +
                ", nrRegelementare=" + nrRegelementare +
                '}';
    }
}
