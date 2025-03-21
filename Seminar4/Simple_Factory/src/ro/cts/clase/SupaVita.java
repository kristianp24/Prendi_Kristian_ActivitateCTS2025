package ro.cts.clase;

public class SupaVita extends Supa{

    public SupaVita(float pret, float cantitate, float calori) {
        super(pret, cantitate, calori);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Supa are pretul: " + pret + ", gramaj: "+ cantitate+" calorii: "+calori);
    }
}
