package ro.cts.clase;

public class SupaCocos extends Supa{

    public SupaCocos(float pret, float cantitate, float calori) {
        super(pret, cantitate, calori);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(super.toString());
    }
}
