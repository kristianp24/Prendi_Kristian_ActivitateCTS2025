package cts.main;

import cts.clase.AdapterMetrou;
import cts.clase.BiletAutobuz;
import cts.clase.BiletMetrou;
import cts.clase.IBiletAutobuz;

public class Main {
    public static void vindeBilet(IBiletAutobuz bilet){
        bilet.cumparaBilet();
    }
    public static void main(String[] args) {
        IBiletAutobuz biletAutobuz = new BiletAutobuz("21/05/2025", 3.5f,90);
        vindeBilet(biletAutobuz);
        BiletMetrou biletMetrou = new BiletMetrou("22/05/2025", 20.2f, 90);

        AdapterMetrou adapterMetrou = new AdapterMetrou(biletMetrou);
        vindeBilet(adapterMetrou);
    }
}