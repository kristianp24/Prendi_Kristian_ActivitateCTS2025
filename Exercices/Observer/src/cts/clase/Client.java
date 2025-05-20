package cts.clase;

public class Client implements Observer{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteOferta(String oferta) {
        System.out.println(this.nume + " a primit urm oferta: "+ oferta);
    }
}
