package ro.cts.clase;

public class FactorySupa implements AbstractFactory{

    private int cantitate;

    public FactorySupa(int cantitate) {
        this.cantitate = cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tipuri, float pret, float calorii) {
        switch ((Supe) tipuri){
            case SUPELEGUME -> {
                return new SupaLegume(pret, calorii, cantitate);
            }
            case SUPECIUPERCI -> {
                return new SupaCiuperci(pret, calorii, cantitate);

            }
            default -> {
                return null;
            }
        }

    }
}
