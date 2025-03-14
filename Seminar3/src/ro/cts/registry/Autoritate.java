package ro.cts.registry;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Autoritate {
    private String nume;
    private String website;
    private Map<String, Reglementare> map = new HashMap<>();
    public static Autoritate instance = null;

    private Autoritate(String nume, String website) {
        this.nume = nume;
        this.website = website;
    }

    public static synchronized Autoritate getInstance(String nume, String website){
        if (instance == null){
            instance = new Autoritate(nume, website);
        }
        return instance;

    }

    @Override
    public String toString() {
        return "Autoritate{" +
                "nume='" + nume + '\'' +
                ", website='" + website + '\'' +
                '}';
    }

    public  Reglementare reglementeazaModel(String model){
        if (!map.containsKey(model)){
            map.put(model, new Reglementare(model, new Date().toString(),map.size()+1));

        }
        return map.get(model);
    }

}
