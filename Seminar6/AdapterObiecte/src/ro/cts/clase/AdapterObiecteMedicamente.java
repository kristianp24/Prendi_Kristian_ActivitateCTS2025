package ro.cts.clase;

public class AdapterObiecteMedicamente extends MedicamentFarmacie{
    private MedicamentSpital medicamentSpital;

    // Asta nu va fi folosit
    public AdapterObiecteMedicamente(String numeMedicament, String dataExpirarii, boolean esteInStoc, float pret) {
        super(numeMedicament, dataExpirarii, esteInStoc, pret);
    }

    // Adapter de obiecte,, voi avea un obiect pe care o sa il adaptez, obiectul se primeste la constructor

    public AdapterObiecteMedicamente(MedicamentSpital medicamentSpital){
        super(medicamentSpital.numeMedicament, "25/06/2025", true, medicamentSpital.pret);
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament(){
        medicamentSpital.achizitioneazaMedicament();
    }

}
