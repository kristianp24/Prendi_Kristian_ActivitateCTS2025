package ro.cts.clase;

public class PlataCard implements IPlata{
    private int sold;

    public PlataCard(int sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(int pret) {
        if (this.sold < pret){
            System.out.println("Nu aveti suficienti bani");
        }
        else{
            this.sold -= pret;
            System.out.println("A fost platita suma de "+pret+" RON.");
        }
    }
}
