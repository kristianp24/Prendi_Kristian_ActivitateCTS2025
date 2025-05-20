package cts.clase;

public interface SpitalObserver {
    void adaugaClient(IClient client);
    void stergeClient(IClient client);
    void notificaClienti(String mesaj);
}
