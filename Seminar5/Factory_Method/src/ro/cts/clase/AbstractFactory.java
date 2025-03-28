package ro.cts.clase;

public interface AbstractFactory {
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tipuri, float pret, float calorii);
}
