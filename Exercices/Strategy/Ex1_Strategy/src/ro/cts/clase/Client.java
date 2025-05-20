package ro.cts.clase;

public class Client {
    private String nume;
    private IPlata metodaPlata;

    public Client(String nume) {
        this.nume = nume;
        this.metodaPlata = new PlataCash();
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setMetodaPlata(IPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void platesteMasa(int pret){
        this.metodaPlata.plateste(pret);
    }
}
