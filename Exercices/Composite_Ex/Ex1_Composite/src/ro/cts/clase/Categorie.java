package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements Structura{
    private List<Structura> listaAutobuze;
    private String nume;

    public Categorie(String nume) {
        this.nume = nume;
        this.listaAutobuze = new ArrayList<>();
    }


    @Override
    public void adaugaAutobuz(Structura s) {
        this.listaAutobuze.add(s);
    }

    @Override
    public void stergeAutobuz(Structura a) {
       this.listaAutobuze.remove(a);
    }

    @Override
    public Structura getAutobuz(int index) {
        return this.listaAutobuze.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("Categoria " + this.nume +" are autobuzele ");
        for(Structura s : listaAutobuze){
            System.out.println(s);
        }
    }
}
