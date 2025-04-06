package ro.cts.factory;

import ro.cts.clase.Asistent;
import ro.cts.clase.Brancardier;
import ro.cts.clase.PersonalSpital;

public class FactoryPersonalMedical implements AbstractFactory{

    public FactoryPersonalMedical() {
    }

    @Override
    public PersonalSpital getPersonal(TipuriPersonal tip, String nume, int salariul, String ziuaNasterii) {
        switch ((TipuriPersonalMedical) tip){
            case Brancardier -> {
                return new Brancardier(nume, salariul, ziuaNasterii);
            }
            case Asistent -> {
                return new Asistent(nume, salariul, ziuaNasterii);
            }
            case null, default -> {
                return null;
            }
        }
    }
}
