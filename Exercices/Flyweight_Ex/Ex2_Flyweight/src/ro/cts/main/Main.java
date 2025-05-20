package ro.cts.main;

import ro.cts.clase.FabricaClienti;
import ro.cts.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare(20,5,"20/10/2025",15);
        Rezervare rezervare2 = new Rezervare(22,4,"20/10/2025",19);

        FabricaClienti fabricaClienti = new FabricaClienti();
        fabricaClienti.getClient("1234","Mihai","Mihai@yahoo.com").afiseazaClient(rezervare);
        fabricaClienti.getClient("1234", "Mihai", "alo@yaoo.com").afiseazaClient(rezervare2);

    }
}