package ro.cts.clase;

public class AutobuzLinie {
    private Autobuz autobuz;
    private String primaStatie;
    private String ultimaStatie;

    private  String numarLinie;

    public AutobuzLinie(Autobuz autobuz, String primaStatie, String ultimaStatie, String numarLinie) {
        this.autobuz = autobuz;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
        this.numarLinie = numarLinie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("autobuz=").append(autobuz);
        sb.append(", primaStatie='").append(primaStatie).append('\'');
        sb.append(", ultimaStatie='").append(ultimaStatie).append('\'');
        sb.append(", numarLinie='").append(numarLinie).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
