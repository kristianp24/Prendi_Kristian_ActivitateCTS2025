package cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Sucuri implements Structura{
     private List<Structura> sucuri;

    public Sucuri() {
        this.sucuri = new ArrayList<>();
    }

    @Override
    public void adaugaNod(Structura nod) {
        this.sucuri.add(nod);
    }

    @Override
    public void stergeNod(Structura nod) {
      this.sucuri.remove(nod);
    }

    @Override
    public Structura getNod(int index) {
        return this.sucuri.remove(index);
    }

    @Override
    public void descrie() {
        System.out.println("Subsectiunea sucuri are subsectiunile:");
        for (Structura s : this.sucuri){
            s.descrie();
        }
    }
}
