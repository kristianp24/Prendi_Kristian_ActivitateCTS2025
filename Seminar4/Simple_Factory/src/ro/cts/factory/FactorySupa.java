package ro.cts.factory;

import ro.cts.clase.Supa;
import ro.cts.clase.SupaCocos;
import ro.cts.clase.SupaLegume;
import ro.cts.clase.SupaVita;

public class FactorySupa {
    private float pret;
    private float calori;

    public FactorySupa(float pret, float calori) {
        this.pret = pret;
        this.calori = calori;
    }

    public Supa getSupa(TipSupe tip, float cantitate){
        switch (tip)
        {
            case VITA -> {
                Supa supaDeVita = new SupaVita(pret, cantitate, calori);
                return supaDeVita;
            }
            case LEGUME -> {
                Supa supaLegume = new SupaLegume(pret, cantitate, calori);
                return supaLegume;
            }
            case COCOS -> {
                Supa supaCocos = new SupaCocos(pret, cantitate, calori);
                return supaCocos;
            }
            case null, default -> {
                return null;
            }
        }
    }
}
