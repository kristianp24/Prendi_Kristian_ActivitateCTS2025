package ro.cts.clase;

public class Rezervare {
    private String numeClient;
    private boolean hasAsezareGeam;
    private boolean hasScauneErg;
    private boolean hasMasaDecorata;
    private String genMuzica;

    protected Rezervare(String numeClient, boolean hasAsezareGeam, boolean hasScauneErg, boolean hasMasaDecorata, String genMuzica) {
        this.numeClient = numeClient;
        this.hasAsezareGeam = hasAsezareGeam;
        this.hasScauneErg = hasScauneErg;
        this.hasMasaDecorata = hasMasaDecorata;
        this.genMuzica = genMuzica;
    }

    protected Rezervare setNumeClient(String numeClient) {
        this.numeClient = numeClient;
        return this;
    }

    public Rezervare setHasAsezareGeam(boolean hasAsezareGeam) {
        this.hasAsezareGeam = hasAsezareGeam;
        return this;
    }

    public Rezervare setHasScauneErg(boolean hasScauneErg) {
        this.hasScauneErg = hasScauneErg;
        return this;
    }

    public Rezervare setHasMasaDecorata(boolean hasMasaDecorata) {
        this.hasMasaDecorata = hasMasaDecorata;
        return this;
    }

    public Rezervare setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", hasAsezareGeam=").append(hasAsezareGeam);
        sb.append(", hasScauneErg=").append(hasScauneErg);
        sb.append(", hasMasaDecorata=").append(hasMasaDecorata);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

