package ro.cts.main;

import ro.cts.clase.AbstractRezervare;
import ro.cts.clase.RezervareTerasa;

public class Main {
    public static void main(String[] args) {
        AbstractRezervare rezTerasa = new RezervareTerasa(12,15,"Mihai",22,true);
        AbstractRezervare rezervareTerasa2 = rezTerasa.copiaza(25);
        AbstractRezervare rezervareTerasa3 = rezTerasa.copiaza(28);

        System.out.println(rezTerasa);
        System.out.println(rezervareTerasa2);
        System.out.println(rezervareTerasa3);
    }
}