package ro.cts.clase;

public class SaladBuilder implements AbstractBuilder{
    private boolean containsTomato;
    private boolean containsPotato;
    private boolean containsCabbage;

    private boolean containsChicken;
    private boolean containsBeef;
    private boolean containsAvocado;

    private boolean containsSoia;

    public SaladBuilder setContainsTomato(boolean containsTomato) {
        this.containsTomato = containsTomato;
        return this;
    }

    public SaladBuilder setContainsPotato(boolean containsPotato) {
        this.containsPotato = containsPotato;
        return this;
    }

    public SaladBuilder setContainsCabbage(boolean containsCabbage) {
        this.containsCabbage = containsCabbage;
        return this;
    }

    public SaladBuilder setContainsChicken(boolean containsChicken) {
        this.containsChicken = containsChicken;
        return this;
    }

    public SaladBuilder setContainsBeef(boolean containsBeef) {
        this.containsBeef = containsBeef;
        return this;
    }

    public SaladBuilder setContainsAvocado(boolean containsAvocado) {
        this.containsAvocado = containsAvocado;
        return this;
    }

    public SaladBuilder setContainsSoia(boolean containsSoia) {
        this.containsSoia = containsSoia;
        return this;
    }

    public SaladBuilder(){
        this.containsAvocado = false;
        this.containsBeef = false;
        this.containsCabbage = false;
        this.containsSoia = false;
        this.containsPotato = false;
        this.containsTomato = false;
        this.containsChicken = false;
    }
    @Override
    public Salad build() {
        return new Salad(containsTomato, containsPotato, containsCabbage, containsChicken, containsBeef, containsAvocado, containsAvocado);
    }
}
