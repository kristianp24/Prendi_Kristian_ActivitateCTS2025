package ro.cts.clase;

public class RezervareInterior extends AbstractRezervare {
    private boolean esteLaParter;

    public RezervareInterior(int nrParticipanti, int ora, String numeClient, int ziuaLunii, boolean esteLaParter) {
        super(nrParticipanti, ora, numeClient, ziuaLunii);
        this.esteLaParter = esteLaParter;
    }

    public RezervareInterior() {
        super();
    }

    @Override
    public AbstractRezervare copiaza(int ziuaLunii) {
        RezervareInterior rezervare = new RezervareInterior();
        rezervare.ziuaLunii = ziuaLunii;
        rezervare.ora = this.ora;
        rezervare.nrParticipanti = this.nrParticipanti;
        rezervare.numeClient = this.numeClient;
        rezervare.esteLaParter = true;
        return rezervare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RezervareInterior{");
        sb.append("esteLaParter=").append(esteLaParter);
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}
