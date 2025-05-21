package cts.clase;

public class BiletAutobuz implements IBiletAutobuz{
    private String data;
    private float pretul;
    private int durataMinute;

    public BiletAutobuz(String data, float pretul, int durataMinute) {
        this.data = data;
        this.pretul = pretul;
        this.durataMinute = durataMinute;
    }


    @Override
    public void cumparaBilet() {
        System.out.println("A fost cumpara biletul de autobuz in data de "+this.data+" cu pretul de: "
                +this.pretul+" RON cu durata "
                + this.durataMinute + " minute");
    }
}
