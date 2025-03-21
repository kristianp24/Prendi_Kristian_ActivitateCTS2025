package ro.cts.clase;

public abstract class AbstractRezervare {
    protected int nrParticipanti;
    protected int ora;
    protected String numeClient;
    protected int ziuaLunii;

    public void setZiuaLunii(int ziuaLunii) {
        this.ziuaLunii = ziuaLunii;
    }

    public AbstractRezervare(int nrParticipanti, int ora, String numeClient, int ziuaLunii) {
        if (nrParticipanti < 2){
            this.nrParticipanti = 2;
        }
        else{
            this.nrParticipanti = nrParticipanti;
        }
        if (ora >= 10 && ora <= 22){
            this.ora = ora;
        }
        else{
            this.ora = 12;
        }
        if (numeClient.length() > 2){
            this.numeClient = numeClient;
        }
        else{
            this.numeClient = "Anonim";
        }
        if (this.ziuaLunii > 31){
            this.ziuaLunii = 31;
        }
        else{
            this.ziuaLunii = ziuaLunii;
        }

    }



    public AbstractRezervare() {
        this.ziuaLunii = 5;
        this.ora = 12;
        this.numeClient="mIHAI";
        this.nrParticipanti= 2;
    }

    public abstract AbstractRezervare copiaza(int ziuaLunii);

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractRezervare{");
        sb.append("nrParticipanti=").append(nrParticipanti);
        sb.append(", ora=").append(ora);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", ziuaLunii=").append(ziuaLunii);
        sb.append('}');
        return sb.toString();
    }
}
