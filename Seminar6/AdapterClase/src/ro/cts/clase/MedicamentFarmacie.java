package ro.cts.clase;

public class MedicamentFarmacie implements IMedicamentFarmacie {
    private String numeMedicament;
    private String dataExpirarii;
    private float pret;
    private boolean esteInStoc;

    public MedicamentFarmacie(String numeMedicament, String dataExpirarii, boolean esteInStoc, float pret) {
        this.numeMedicament = numeMedicament;
        this.dataExpirarii = dataExpirarii;
        this.esteInStoc = esteInStoc;
        this.pret = pret;
    }

    public void cumparaMedicament(){
        System.out.println("Medicamentul"+ this.numeMedicament + " care expira la " + this.dataExpirarii + " are pretul: "+ this.pret);
    }
}
