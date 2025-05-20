package cts.clase;

public interface Subject {
    void adaugaClient(Observer observer);
    void stergeClient(Observer observer);
    void trimiteMesaj(String mesaj);
}
