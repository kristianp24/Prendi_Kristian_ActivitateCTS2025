package ro.cts.clase;

public class Rezervare {
    int nrMasa;
    int nrPersoane;
    String data;
    int ora;

    public Rezervare(int nrMasa, int nrPersoane, String data, int ora) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.data = data;
        this.ora = ora;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nrMasa=").append(nrMasa);
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", data='").append(data).append('\'');
        sb.append(", ora=").append(ora);
        sb.append('}');
        return sb.toString();
    }
}
