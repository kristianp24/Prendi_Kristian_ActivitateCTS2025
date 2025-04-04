package ro.cts.factory;

import ro.cts.clase.*;

public class PersonalFactory {
    public PersonalFactory() {
    }

    public PersonalSpital getPersonal(Personal tipuri, String name, int salariul, float vechime){
        switch (tipuri){
            case Medic -> {
                return new Medic(salariul, vechime, name);
            }
            case Asistent -> {
                return new Asistent(salariul, vechime, name);
            }
            case Brancardier -> {
                return new Brancardier(salariul, vechime, name);
            }
            case null, default -> {
                return null;
            }
        }

    }
}
