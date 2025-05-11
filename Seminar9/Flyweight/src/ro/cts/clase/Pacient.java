package ro.cts.clase;

public class Pacient implements PacientAbstract{

    private String nume;
    private String nrTelefon;
    private String adresaMail;

    public Pacient(String nume, String nrTelefon, String adresaMail) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresaMail = adresaMail;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", nrTelefon='" + nrTelefon + '\'' +
                ", adresaMail='" + adresaMail + '\'' +
                '}';
    }

    @Override
    public void afiseazaPacient(Spitalizare spitalizare) {
        System.out.println(this.toString());
        System.out.println(spitalizare);
    }
}
