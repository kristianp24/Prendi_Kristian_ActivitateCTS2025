package ro.cts.clase;

public class BuilderPacient implements AbstractBuilder{
    protected boolean arePatRatabil;
    protected  boolean areMicDejun;
    protected boolean arePapuci;

    protected boolean areHalat;

    public BuilderPacient() {
        this.areHalat = false;
        this.areMicDejun = false;
        this.arePapuci = false;
        this.arePatRatabil = false;
    }

    public BuilderPacient setArePatRatabil(boolean arePatRatabil) {
        this.arePatRatabil = arePatRatabil;
        return this;
    }

    public BuilderPacient setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
        return this;
    }

    public BuilderPacient setArePapuci(boolean arePapuci) {
        this.arePapuci = arePapuci;
        return this;
    }

    public BuilderPacient setAreHalat(boolean areHalat) {
        this.areHalat = areHalat;
        return this;
    }

    @Override
    public Pacient build() {
        return new Pacient(this.arePatRatabil, this.areMicDejun, this.areHalat, this.arePatRatabil);
    }
}
