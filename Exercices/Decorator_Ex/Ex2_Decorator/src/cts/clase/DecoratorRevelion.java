package cts.clase;

public class DecoratorRevelion extends PrinterDecorator{

    public DecoratorRevelion(Printer printerBilet) {
        super(printerBilet);
    }

    @Override
    public void adaugaFelicitare() {
        System.out.println("La multi Ani de Revelion");
    }
}
