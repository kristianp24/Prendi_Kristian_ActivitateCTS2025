package ro.cts.clase;

public class RezervareBuilder implements AbstractBuilder {

    private Rezervare rezervare;

    public RezervareBuilder(String nume){
        rezervare = new Rezervare(nume, false, false, false, "fara Muzica");
    }

    public RezervareBuilder setHasScauneErg(boolean val){
        rezervare.setHasScauneErg(val);
        return this;
    }

    public RezervareBuilder setHasAsezareGeam(boolean val){
        rezervare.setHasAsezareGeam(val);
        return this;
    }

    public RezervareBuilder setHasMasaDecorata(boolean val){
        rezervare.setHasMasaDecorata(val);
        return this;
    }

    public RezervareBuilder setGenMuzica(String val){
        rezervare.setGenMuzica(val);
        return this;
    }


    @Override
    public Rezervare build() {
        return rezervare;
    }
}
