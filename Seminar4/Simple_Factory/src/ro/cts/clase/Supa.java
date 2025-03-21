package ro.cts.clase;

public abstract class Supa {
    protected float pret;
    protected float cantitate;
    protected float calori;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Supa{");
        sb.append("pret=").append(pret);
        sb.append(", cantitate=").append(cantitate);
        sb.append(", calori=").append(calori);
        sb.append('}');
        return sb.toString();
    }

    public Supa(float pret, float cantitate, float calori) {
        this.pret = pret;
        this.cantitate = cantitate;
        this.calori = calori;
    }

    public float calculeazaPretPerSutaDeGrame(){
        return pret / cantitate * 100;
    }

    public abstract void afiseazaDescriere();
}
