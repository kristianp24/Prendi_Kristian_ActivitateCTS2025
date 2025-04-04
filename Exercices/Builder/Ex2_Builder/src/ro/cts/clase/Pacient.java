package ro.cts.clase;

public class Pacient {
    protected boolean arePatRatabil;
    protected  boolean areMicDejun;
    protected boolean arePapuci;

    protected boolean areHalat;

    public Pacient(boolean arePatRatabil, boolean areMicDejun, boolean arePapuci, boolean areHalat) {
        this.arePatRatabil = arePatRatabil;
        this.areMicDejun = areMicDejun;
        this.arePapuci = arePapuci;
        this.areHalat = areHalat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("arePatRatabil=").append(arePatRatabil);
        sb.append(", areMicDejun=").append(areMicDejun);
        sb.append(", arePapuci=").append(arePapuci);
        sb.append(", areHalat=").append(areHalat);
        sb.append('}');
        return sb.toString();
    }
}
