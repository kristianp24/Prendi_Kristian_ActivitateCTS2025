package cts.clase;

public class DecoratorCraciun extends PrinterDecorator{

    public DecoratorCraciun(Printer printerBilet) {
        super(printerBilet);
    }

    @Override
    public void adaugaFelicitare() {
        System.out.println("La multi ani de Craciun");
    }
}
