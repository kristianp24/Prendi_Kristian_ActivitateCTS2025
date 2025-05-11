package ro.cts.main;

import ro.cts.clase.Pacient;
import ro.cts.clase.SpitalPrivat;
import ro.cts.clase.SpitalPublic;
import ro.cts.clase.TemplateInternare;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Popica", 5);
        TemplateInternare spital = new SpitalPublic("Spital");
        spital.internare(pacient);

        TemplateInternare spitalPrivat = new SpitalPrivat("Spitalul privat");
        spitalPrivat.internare(pacient);
    }
}