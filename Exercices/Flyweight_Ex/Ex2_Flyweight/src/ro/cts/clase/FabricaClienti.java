package ro.cts.clase;

import java.util.HashMap;

public class FabricaClienti {
    private HashMap<String, ClientAbstract> colectie;

    public FabricaClienti() {
        this.colectie = new HashMap<>();
    }

    public ClientAbstract getClient(String nrTelefon, String nume, String email){
        ClientAbstract clientAbstract = colectie.get(nrTelefon);
        if(clientAbstract == null){
            clientAbstract = new Client(nume, nrTelefon, email);
            this.colectie.put(nrTelefon, clientAbstract);
        }
        return clientAbstract;

    }
}
