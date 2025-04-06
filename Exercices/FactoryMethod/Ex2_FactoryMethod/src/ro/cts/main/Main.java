package ro.cts.main;

import ro.cts.clase.PersonalSpital;
import ro.cts.factory.FactoryNonMedical;
import ro.cts.factory.FactoryPersonalMedical;
import ro.cts.factory.TipuriPersonalMedical;
import ro.cts.factory.TipuriPersonalNonMedical;

public class Main {
    public static void main(String[] args){
        FactoryNonMedical factoryNonMedical = new FactoryNonMedical();
        FactoryPersonalMedical factoryPersonalMedical = new FactoryPersonalMedical();

        PersonalSpital asistent = factoryPersonalMedical.getPersonal(TipuriPersonalMedical.Asistent, "Kristian", 6800, "20/06/1980");
        PersonalSpital brancardier = factoryPersonalMedical.getPersonal(TipuriPersonalMedical.Brancardier, "Mihai", 4900, "25/09/1992");
        PersonalSpital registrator = factoryNonMedical.getPersonal(TipuriPersonalNonMedical.Registrator, "Popescu", 8000, "28/08/1992");
        PersonalSpital secretare = factoryNonMedical.getPersonal(TipuriPersonalNonMedical.Secretar, "Ioana", 7000, "05/08/1990");

        System.out.println(asistent);
        System.out.println(brancardier);
        System.out.println(registrator);
        System.out.println(secretare);
    }
}
