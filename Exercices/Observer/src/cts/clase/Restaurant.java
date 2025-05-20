package cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Subject{
    private String nume;
    private List<Observer> clientiFiedli;

    public Restaurant(String nume) {
        this.nume = nume;
        this.clientiFiedli = new ArrayList<>();
    }

    @Override
    public void adaugaClient(Observer observer) {
        this.clientiFiedli.add(observer);
    }

    @Override
    public void stergeClient(Observer observer) {
        this.clientiFiedli.remove(observer);
    }

    @Override
    public void trimiteMesaj(String mesaj) {
       for (Observer o : this.clientiFiedli){
           o.primesteOferta(mesaj);
       }
    }
}
