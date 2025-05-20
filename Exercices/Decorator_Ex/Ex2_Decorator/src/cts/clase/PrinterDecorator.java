package cts.clase;

public abstract class PrinterDecorator implements Printer {
    private Printer printerBilet;

    public PrinterDecorator(Printer printerBilet) {
        this.printerBilet = printerBilet;
    }

    @Override
    public void printeazaBilet(){
        this.printerBilet.printeazaBilet();
        adaugaFelicitare();
    }

    public abstract void adaugaFelicitare();
}
