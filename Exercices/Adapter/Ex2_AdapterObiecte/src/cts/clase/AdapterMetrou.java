package cts.clase;

public class AdapterMetrou implements IBiletAutobuz{
    private BiletMetrou biletMetrou;

    public AdapterMetrou(BiletMetrou biletMetrou) {
        this.biletMetrou = biletMetrou;
    }


    @Override
    public void cumparaBilet() {
        biletMetrou.achizitioneazaBilet();
    }
}
