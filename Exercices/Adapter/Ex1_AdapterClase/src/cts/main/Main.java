package cts.main;

import cts.clase.AdapterMetrou;
import cts.clase.BiletAutobuz;
import cts.clase.IBiletAutobuz;

public class Main {

    public static void vindeBilet(IBiletAutobuz bilet){
        bilet.cumparaBilet();
    }
    public static void main(String[] args) {
       IBiletAutobuz biletAutobuz = new BiletAutobuz("21/05/2025", 3.5f,90);
       vindeBilet(biletAutobuz);

        AdapterMetrou biletMetrou = new AdapterMetrou("22/05/2025", 5.0f, 90);
        vindeBilet(biletMetrou);
    }
}