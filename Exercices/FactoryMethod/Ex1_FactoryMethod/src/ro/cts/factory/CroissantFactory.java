package ro.cts.factory;

import ro.cts.clase.BakeryProducts;
import ro.cts.clase.CroissantNutella;
import ro.cts.clase.CroissantPistachio;

public class CroissantFactory extends AbstractFactory{
    private String tipNutella;
    public CroissantFactory(int price, int quantity, String tipNutella) {
        super(price, quantity);
        this.tipNutella = tipNutella;
    }

    public void setTipNutella(String tipNutella) {
        this.tipNutella = tipNutella;
    }

    @Override
    public BakeryProducts getProducts(Types types) {
        switch ((CroissantsTypes)types){
            case NUTELLA -> {
                return new CroissantNutella(this.price, this.quantity, this.tipNutella);
            }
            case PISTACHIO -> {
                return new CroissantPistachio(this.price, this.quantity);
            }
            case null, default -> {
                return null;
            }
        }
    }


}
