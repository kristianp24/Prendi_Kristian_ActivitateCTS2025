package cts.clase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FabricaAeronave {
    private HashMap<String,IAeronava> aeronave;
    private String name;

    public FabricaAeronave(String name) {
        this.name = name;
        this.aeronave = new HashMap<>();
    }

    public IAeronava getAeronava(String tip, String model, int nrLocuri, int an){
        IAeronava aeronava = this.aeronave.get(model);
        if (aeronava == null)
        {
            aeronava = new Aeronava(tip, model, nrLocuri, an);
            this.aeronave.put(model, aeronava);
        }
        return aeronava;
    }
}
