package ro.cts.factory;

import ro.cts.clase.PersonalSpital;
import ro.cts.clase.Registrator;
import ro.cts.clase.Secretar;

public class FactoryNonMedical implements AbstractFactory{

    public FactoryNonMedical() {
    }

    @Override
    public PersonalSpital getPersonal(TipuriPersonal tip, String nume, int salariul, String ziuaNasterii) {
        switch ((TipuriPersonalNonMedical)tip){
            case Secretar -> {
                return new Secretar(nume, salariul, ziuaNasterii);
            }
            case Registrator -> {
                return new Registrator(nume, salariul, ziuaNasterii);
            }
            case null, default -> {
                return null;
            }
        }

    }
}
