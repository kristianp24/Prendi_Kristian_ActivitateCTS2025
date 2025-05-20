package cts.main;

import cts.clase.Client;
import cts.clase.Restaurant;

public class Main {
    public static void main(String[] args){
        Client client = new Client("Client0");
        Client client1 = new Client("Client1");
        Client client2 = new Client("Client2");

        Restaurant restaurant = new Restaurant("Suzana");
        restaurant.adaugaClient(client);
        restaurant.adaugaClient(client1);
        restaurant.adaugaClient(client2);

        restaurant.trimiteMesaj("OFERTA! Aripioare la reducere de 30%!");




    }
}
