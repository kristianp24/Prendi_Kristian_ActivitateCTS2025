package ro.cts.main;

import ro.cts.clase.Medic;
import ro.cts.clase.Personal;
import ro.cts.clase.PersonalSpital;
import ro.cts.factory.PersonalFactory;

public class Main {
    public static void main(String[] args) {
        PersonalFactory factory = new PersonalFactory();

        PersonalSpital medic1 = factory.getPersonal(Personal.Medic, "Kristian", 2000, 1.5f);
        PersonalSpital asistent = factory.getPersonal(Personal.Asistent, "Ani", 1500, 1.6f);
        System.out.println(medic1);
        System.out.println(asistent);
    }
}