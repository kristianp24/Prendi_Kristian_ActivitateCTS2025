package ro.cts.clase;

public class AutobuzConcret implements Autobuz{
    private String marca;
    private int nrLocuri;
    private int anFabrcatie;

    public AutobuzConcret(String marca, int nrLocuri, int anFabrcatie) {
        this.marca = marca;
        this.nrLocuri = nrLocuri;
        this.anFabrcatie = anFabrcatie;
    }


    @Override
    public void afiseazaAutobuz(Autobuz a) {
        System.out.println("Model: "+ this.marca+" , an fabricatie: "+this.anFabrcatie+" , nr locuri: "+this.nrLocuri);
    }
}
