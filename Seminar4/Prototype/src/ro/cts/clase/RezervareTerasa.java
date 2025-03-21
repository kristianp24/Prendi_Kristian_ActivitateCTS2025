package ro.cts.clase;

public class RezervareTerasa extends AbstractRezervare{
    public boolean esteFumator;

    public RezervareTerasa(int nrParticipanti, int ora, String numeClient, int ziuaLunii, boolean esteFumator) {
        super(nrParticipanti, ora, numeClient, ziuaLunii);
        this.esteFumator = esteFumator;
    }

    public RezervareTerasa() {
        super();
    }

    @Override
    public AbstractRezervare copiaza(int ziuaLunii) {
        RezervareTerasa rezervare = new RezervareTerasa();
        rezervare.esteFumator = false;
        rezervare.nrParticipanti = this.nrParticipanti;
        rezervare.numeClient=this.numeClient;
        rezervare.ora = this.ora;
        rezervare.ziuaLunii = ziuaLunii;
        return rezervare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RezervareTerasa{");
        sb.append("esteFumator=").append(esteFumator);
        sb.append(", nrParticipanti=").append(nrParticipanti);
        sb.append(", ora=").append(ora);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", ziuaLunii=").append(ziuaLunii);
        sb.append('}');
        return sb.toString();
    }
}
