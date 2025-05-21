package cts.clase;

public class AdapterMetrou extends BiletMetrou implements IBiletAutobuz{

    public AdapterMetrou(String data, float pretul, int durataMinute) {
        super(data, pretul, durataMinute);
    }

    @Override
    public void cumparaBilet() {
        super.achizitioneazaBilet();
    }
}
