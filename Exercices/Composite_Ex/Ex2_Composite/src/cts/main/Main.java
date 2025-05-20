package cts.main;

import cts.clase.*;

public class Main {
    public static void main(String[] args) {
        Structura sucuri = new Sucuri();
        Structura bauturi = new Bauturi();


        Structura apa = new Apa();
        Structura cafea = new Cafea();
        bauturi.adaugaNod(apa);
        bauturi.adaugaNod(cafea);
        sucuri.adaugaNod(bauturi);

        sucuri.descrie();
    }
}