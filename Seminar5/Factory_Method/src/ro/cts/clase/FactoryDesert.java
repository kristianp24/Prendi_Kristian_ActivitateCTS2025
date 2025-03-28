package ro.cts.clase;

public class FactoryDesert implements AbstractFactory{
    private String crema;

    public FactoryDesert(String crema) {
        this.crema = crema;
    }


    @Override
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tipuri, float pret, float calorii) {
        switch ((Desert) tipuri){
            case TIRAMISU -> {
                return new Tiramisu(pret, calorii, crema);
            }
            case PAPANASI -> {
                return new Papanasi(pret, calorii, crema);
            }
            default -> {
                return null;
            }
        }

    }
}
