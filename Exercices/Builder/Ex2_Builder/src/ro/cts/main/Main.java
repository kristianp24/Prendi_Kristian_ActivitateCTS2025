package ro.cts.main;

import ro.cts.clase.BuilderPacient;
import ro.cts.clase.Pacient;

public class Main {
    public static void main(String[] args) {
        BuilderPacient builderPacient = new BuilderPacient();
        builderPacient.setAreHalat(true).setArePapuci(true);
        Pacient pacient = builderPacient.build();

        builderPacient.setArePatRatabil(true).setAreMicDejun(false).setArePapuci(true);
        Pacient pacient1 = builderPacient.build();

        System.out.println(pacient);
        System.out.println(pacient1);
    }
}