import ro.cts.clase.Autobuz;
import ro.cts.clase.Categorie;
import ro.cts.clase.Structura;

public class Main {
    public static void main(String[] args) {
        Structura categorie1 = new Categorie("Grupuri mari");
        Structura categorie2 = new Categorie("Grupuri medii");
        Structura categorie3 = new Categorie("Grupuri mici");

        Structura autobuz1 = new Autobuz("Mercedes", 20);
        Structura autobuz2 = new Autobuz("Volvo", 60);
        Structura autobuz3 = new Autobuz("Mercedes", 10);
        Structura autobuz4 = new Autobuz("Mercedes", 80);

        categorie1.adaugaAutobuz(autobuz4);
        categorie1.adaugaAutobuz(autobuz2);

        categorie2.adaugaAutobuz(autobuz1);
        categorie3.adaugaAutobuz(autobuz3);

        categorie1.descriere();
        categorie2.descriere();
        categorie3.descriere();



    }
}