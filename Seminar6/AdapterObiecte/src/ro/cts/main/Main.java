package ro.cts.main;

import ro.cts.clase.AdapterObiecteMedicamente;
import ro.cts.clase.MedicamentFarmacie;
import ro.cts.clase.MedicamentSpital;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static  void vindeMedicament(MedicamentFarmacie medicamentFarmacie){
        System.out.println("Bine ati venit la farmacia Tei");
        medicamentFarmacie.cumparaMedicament();
    }

    public static void main(String[] args) {
    // Adapter de obiecte cand avem 2 clase
        // Adaptam spital la farmacie
        // Adaptam spitalul, adapterul has a spital de asta avem instanta de spital (referinta)
        // Adapter cu medicament -> relatie is a, mostenim

        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Paracetamol", "20.05.2026", true, 10.5f);
        MedicamentFarmacie medicamentFarmacie1 = new MedicamentFarmacie("Theraflu", "14,09,2027", true, 14.6f);
        vindeMedicament(medicamentFarmacie);

        MedicamentSpital medicamentSpital = new MedicamentSpital("Medicament Spital", 25.5f);
        // Adaptam acest obiect medicament spital ca sa il putem folosi
        AdapterObiecteMedicamente adapter = new AdapterObiecteMedicamente(medicamentSpital);
        vindeMedicament(adapter);

        // Interfata treb sa fie la obiectul pe care adaptam, la adapterul de clase

    }
}