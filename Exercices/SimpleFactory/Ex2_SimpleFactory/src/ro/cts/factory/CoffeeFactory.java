package ro.cts.factory;

import ro.cts.clase.Capuccino;
import ro.cts.clase.Coffees;
import ro.cts.clase.Espresso;
import ro.cts.clase.Latte;

public class CoffeeFactory {
    private String tipulDeCafeaua;
    private final int gramajEsspreso = 30;
    private final int gramajLatte = 250;
    private final int gramajCappucino = 200;
    private final int pretEsspreso = 9;
    private final int pretLatteCappucino = 15;
    public CoffeeFactory(String tip){
        this.tipulDeCafeaua = tip;

    }

    public Coffees getProdus(CofeeTypes types, String aroma, String tipulDeEsspreso){
        switch (types){
            case LATTE -> {
                return new Latte(this.tipulDeCafeaua,this.gramajLatte, this.pretLatteCappucino,aroma);
            }
            case ESPRESSO -> {
                return new Espresso(this.tipulDeCafeaua, this.gramajEsspreso, this.pretEsspreso, tipulDeEsspreso);
            }
            case CAPUCCINO -> {
                return new Capuccino(this.tipulDeCafeaua, this.gramajCappucino, this.pretLatteCappucino);
            }
            case null, default -> {
                return null;
            }
        }
    }
}
