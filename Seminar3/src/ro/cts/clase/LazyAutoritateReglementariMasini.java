package ro.cts.clase;

public class LazyAutoritateReglementariMasini {
    private String nume;
    private String website;
    private int nrReglementari;
    private static LazyAutoritateReglementariMasini instance = null;  // Eager initialization

    private LazyAutoritateReglementariMasini(){

    }

    private LazyAutoritateReglementariMasini(String nume, String website, int nrReglementari) {
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

    // Singletone ThreadSafe -> Cea recomandata sa fie utilizata
    public static synchronized LazyAutoritateReglementariMasini getInstance(String nume, String website){
        if (instance == null){
            instance = new LazyAutoritateReglementariMasini(nume, website, 0);
        }
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
