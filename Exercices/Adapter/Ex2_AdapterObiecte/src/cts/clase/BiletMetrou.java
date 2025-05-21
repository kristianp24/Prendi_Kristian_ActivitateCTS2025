package cts.clase;

public class BiletMetrou {
    private String data;
    private float pretul;
    private int durataMinute;

    public BiletMetrou(String data, float pretul, int durataMinute) {
        this.data = data;
        this.pretul = pretul;
        this.durataMinute = durataMinute;
    }

    public void achizitioneazaBilet(){
        System.out.println("A fost achzitionat biletul  de metrou in data de "+this.data+" cu pretul de: "
                +this.pretul+" RON cu durata "
                + this.durataMinute + " minute");
    }
}
