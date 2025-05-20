package cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Bauturi implements Structura{
    private List<Structura> bauturi;

    public Bauturi() {
        this.bauturi = new ArrayList<>();
    }


    @Override
    public void adaugaNod(Structura nod) {
        this.bauturi.add(nod);
    }

    @Override
    public void stergeNod(Structura nod) {
       this.bauturi.remove(nod);
    }

    @Override
    public Structura getNod(int index) {
       return this.bauturi.get(index);
    }

    @Override
    public void descrie() {
        System.out.println("Sectiunea de bauturi are subsectiunile:");
       for (Structura b : this.bauturi){
           b.descrie();
       }
    }
}
