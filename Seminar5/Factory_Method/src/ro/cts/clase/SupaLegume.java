package ro.cts.clase;

public class SupaLegume extends FelDeMancare{
    private int cantitate;


    public SupaLegume(float pret, float calorii, int cantitate) {
        super(pret, calorii);
        this.cantitate = cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupaLegume{");
        sb.append(super.toString());
        sb.append("cantitate=").append(cantitate);
        sb.append('}');
        return sb.toString();
    }
}
