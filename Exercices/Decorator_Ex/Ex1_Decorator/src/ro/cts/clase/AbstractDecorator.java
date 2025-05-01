package ro.cts.clase;

public abstract class AbstractDecorator implements Wash {
    protected Wash washer;

    public AbstractDecorator(Wash washer) {
        this.washer = washer;
    }



    @Override
    public float getPrice() {
        return this.washer.getPrice();
    }

    @Override
    public void showDescription() {
           this.washer.showDescription();
           showModifiedDescription();
    }

    public abstract void showModifiedDescription();
}
