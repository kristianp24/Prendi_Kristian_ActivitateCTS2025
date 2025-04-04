package ro.cts.main;

import ro.cts.clase.AdaptorClaseMedicament;
import ro.cts.clase.Farmacie;
import ro.cts.clase.MedicamentFarmacie;
import ro.cts.clase.MedicamentSpital;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Farmacie farmacie = new Farmacie("Help Net");

        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Theraflu", "20.05.2026", true, 25.5f);
        MedicamentFarmacie medicamentFarmacie2 = new MedicamentFarmacie("Paracetamol", "20.05.2026", true, 5.5f);
        farmacie.vindeMedicament(medicamentFarmacie);
        farmacie.vindeMedicament(medicamentFarmacie2);

        MedicamentSpital medicamentSpital = new MedicamentSpital("Med spital", 10.25f);
        AdaptorClaseMedicament adaptorClaseMedicament = new AdaptorClaseMedicament("Paracetamol", 7.8f);
        farmacie.vindeMedicament(adaptorClaseMedicament);
    }
}