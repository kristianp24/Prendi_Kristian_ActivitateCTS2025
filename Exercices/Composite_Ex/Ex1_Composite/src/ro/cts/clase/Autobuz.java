package ro.cts.clase;

public class Autobuz implements Structura{
    String model;
    int nrLocuri;

    public Autobuz(String model, int nrLocuri) {
        this.model = model;
        this.nrLocuri = nrLocuri;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("model='").append(model).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void adaugaAutobuz(Structura s) {

    }

    @Override
    public void stergeAutobuz(Structura a) {

    }

    @Override
    public Structura getAutobuz(int index) {
        return null;
    }

    @Override
    public void descriere() {

    }
}
