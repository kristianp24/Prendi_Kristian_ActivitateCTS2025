package ro.cts.main;

import ro.cts.clase.Autobuz;
import ro.cts.clase.AutobuzConcret;
import ro.cts.clase.AutobuzLinie;
import ro.cts.clase.FabricaAutobuze;

public class Main {
    public static void main(String[] args) {
        FabricaAutobuze fabricaAutobuze = new FabricaAutobuze();
        Autobuz autobuz = fabricaAutobuze.getAutobuz("Mercedes", 2005, 25);
        fabricaAutobuze.getAutobuz("Mercedes", 2006, 30);
        fabricaAutobuze.getAutobuz("Volvo", 2008, 20);

        AutobuzLinie autobuzLinie = new AutobuzLinie(autobuz, "Vitan", "Gara", "225");

    }
}