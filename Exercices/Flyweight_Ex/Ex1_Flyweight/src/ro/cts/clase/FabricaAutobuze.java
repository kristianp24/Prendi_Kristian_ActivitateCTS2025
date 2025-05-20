package ro.cts.clase;

import java.util.HashMap;

public class FabricaAutobuze {
    private HashMap<String, Autobuz> colectie;

    public FabricaAutobuze() {
        this.colectie = new HashMap<>();
    }

    public Autobuz getAutobuz(String marca, int anFabri, int nrLocuri){
        if (this.colectie.get(marca) != null){
            return this.colectie.get(marca);
        }
        else{
            Autobuz autobuz = new AutobuzConcret(marca, nrLocuri, anFabri);
            this.colectie.put(marca, autobuz);
            return autobuz;
        }
    }
}
