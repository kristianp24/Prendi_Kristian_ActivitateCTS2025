package cts.clase;

public class PrinterBiletAutobuz implements Printer{
    private String mesaj;

    public PrinterBiletAutobuz(String mesaj) {
        this.mesaj = mesaj;
    }

    @Override
    public void printeazaBilet() {
        System.out.println(this.mesaj);
    }
}
