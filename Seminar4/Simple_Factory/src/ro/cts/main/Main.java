package ro.cts.main;

import ro.cts.clase.Supa;
import ro.cts.clase.SupaLegume;
import ro.cts.factory.FactorySupa;
import ro.cts.factory.TipSupe;

public class Main {
    public static void main(String[] args) {
        // Simple Factory
        FactorySupa factory1 = new FactorySupa(20.5f, 200.5f);
        Supa supaLegume = factory1.getSupa(TipSupe.LEGUME, 400f);
        Supa supaVita = factory1.getSupa(TipSupe.VITA, 350f);
        Supa supaCocos = factory1.getSupa(TipSupe.COCOS, 200f);

        supaLegume.afiseazaDescriere();
        supaCocos.afiseazaDescriere();
        supaVita.afiseazaDescriere();

    }
}