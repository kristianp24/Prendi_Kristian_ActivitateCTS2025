package cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements SpitalObserver{
    private List<IClient> clienti;
    private String nume;

    public Spital(String nume) {
        this.nume = nume;
        this.clienti = new ArrayList<>();
    }


    @Override
    public void adaugaClient(IClient client) {
        this.clienti.add(client);
    }

    @Override
    public void stergeClient(IClient client) {
      this.clienti.remove(client);
    }

    @Override
    public void notificaClienti(String mesaj) {
       for (IClient client : this.clienti){
           client.notificaVirus(mesaj);
       }
    }
}
