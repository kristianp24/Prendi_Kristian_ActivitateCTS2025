package ro.cts.factory;

import ro.cts.clase.Cocktail;
import ro.cts.clase.Margarita;
import ro.cts.clase.Mojito;
import ro.cts.clase.PinaColada;

public class CocktailsFactory {
    protected int alcoholMl;
    protected int preparationTimeMinutes;

    public CocktailsFactory(int alcoholMl, int preparationTimeMinutes) {
        this.alcoholMl = alcoholMl;
        this.preparationTimeMinutes = preparationTimeMinutes;
    }

    public Cocktail getCocktail(CocktailsType type, String alcoholType,  boolean containIce){
        switch (type){
            case MOJITO -> {
                return new Mojito(this.alcoholMl, this.preparationTimeMinutes, containIce, alcoholType);
            }
            case PINACOLADA -> {
                return new PinaColada(this.alcoholMl, this.preparationTimeMinutes, containIce, alcoholType);
            }
            case MARGARITA -> {
                return new Margarita(this.alcoholMl, this.preparationTimeMinutes, containIce, alcoholType);
            }
            case null, default -> {
                return null;
            }
        }
    }
}
