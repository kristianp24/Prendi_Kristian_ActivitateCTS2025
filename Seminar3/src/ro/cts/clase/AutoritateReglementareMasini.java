package ro.cts.clase;

public class AutoritateReglementareMasini {
    private String nume;
    private String website;
    private int nrReglementari;
    private static AutoritateReglementareMasini instance = new AutoritateReglementareMasini();   // Eager initialization

    private AutoritateReglementareMasini(){

    }

    private AutoritateReglementareMasini(String nume, String website, int nrReglementari) {
        this.nume = nume;
        this.website = website;
        this.nrReglementari = nrReglementari;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void reglementeazaModel(String numeMasina){
        this.nrReglementari++;
    }

    public static AutoritateReglementareMasini getInstance(){
        return instance;
    }

    @Override
    public String toString() {
        return "AutoritateReglementareMasini{" +
                "nume='" + nume + '\'' +
                ", website='" + website + '\'' +
                ", nrReglementari=" + nrReglementari +
                '}';
    }
}
