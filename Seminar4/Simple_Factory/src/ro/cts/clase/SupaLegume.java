package ro.cts.clase;

public class SupaLegume extends Supa{

    public SupaLegume(float pret, float cantitate, float calori) {
        super(pret, cantitate, calori);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(super.toString());
    }
}
