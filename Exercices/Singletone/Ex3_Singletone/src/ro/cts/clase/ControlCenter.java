package ro.cts.clase;

import java.util.HashMap;

public class ControlCenter {
    private HashMap<String, Bus> busesRegistry;

    public static ControlCenter instance = null;

    private ControlCenter(){
        busesRegistry = new HashMap<>();
    }

    public static synchronized ControlCenter getInstance(){
        if (instance == null){
            instance = new ControlCenter();
        }
        return instance;
    }

    public void adaugaLinie(String key, Bus value){
        if (busesRegistry.containsKey(key)){
            System.out.println("Linia deja existenta!");
        }
        else{
            busesRegistry.put(key, value);
        }

    }


    public void stergeLinia(String key){
        if (busesRegistry.containsKey(key)){
            busesRegistry.remove(key);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ControlCenter{");
        sb.append("busesRegistry=").append(busesRegistry);
        sb.append('}');
        return sb.toString();
    }
}
