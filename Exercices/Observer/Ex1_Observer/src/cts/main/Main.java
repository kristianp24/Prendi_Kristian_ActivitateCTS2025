package cts.main;

import cts.clase.Client;
import cts.clase.IClient;
import cts.clase.Spital;
import cts.clase.SpitalObserver;

public class Main {
    public static void main(String[] args){
        IClient client1 = new Client("Popescu");
        IClient client2 = new Client("Mihai");
        IClient client3 = new Client("George");

        SpitalObserver spitalObserver = new Spital("Spitalul Elisabeta");
        spitalObserver.adaugaClient(client1);
        spitalObserver.adaugaClient(client2);
        spitalObserver.adaugaClient(client3);

        spitalObserver.notificaClienti("COVID-19");
    }
}
