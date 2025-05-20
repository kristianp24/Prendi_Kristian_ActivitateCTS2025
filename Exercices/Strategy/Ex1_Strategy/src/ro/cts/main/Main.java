package ro.cts.main;

import ro.cts.clase.Client;
import ro.cts.clase.PlataCard;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Mihai");
        PlataCard card = new PlataCard(200);

        client.setMetodaPlata(card);
        client.platesteMasa(205);
        client.platesteMasa(150);
    }
}