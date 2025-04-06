package ro.cts.factory;

import ro.cts.clase.PersonalSpital;

public interface AbstractFactory {
    public PersonalSpital getPersonal(TipuriPersonal tip, String nume, int salariul, String ziuaNasterii);
}
