package ro.cts.clase;

public class SupaCiuperci extends FelDeMancare{
    private int gramaj;

    public SupaCiuperci(float pret, float calorii, int gramaj) {
        super(pret, calorii);
        this.gramaj = gramaj;
    }

    public void setGramaj(int gramaj) {
        this.gramaj = gramaj;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupaCiuperci{");
        sb.append(super.toString());
        sb.append("gramaj=").append(gramaj);
        sb.append('}');
        return sb.toString();
    }
}
