package ro.cts.clase;

public class MedicamentSpital {
    protected String numeMedicament;
    protected float pret;

    public MedicamentSpital(String numeMedicament, float pret) {
        this.numeMedicament = numeMedicament;
        this.pret = pret;
    }

    public void achizitioneazaMedicament(){
        prezintaReteta();
        System.out.println("Medicamentul "+ this.numeMedicament + " este achizitionat la pretul de "+ this.pret);
    }

    public void prezintaReteta(){
        System.out.println("Este prezentata reteta pentru medicamentul "+ this.numeMedicament);
    }
}
