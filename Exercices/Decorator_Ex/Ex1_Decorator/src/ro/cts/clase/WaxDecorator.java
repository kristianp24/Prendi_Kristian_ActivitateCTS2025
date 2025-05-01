package ro.cts.clase;

public class WaxDecorator extends AbstractDecorator {


    public WaxDecorator(Wash washer) {
        super(washer);
    }

    @Override
    public void showModifiedDescription() {
        setPrice(10);
        System.out.println("We added wax decorator so the final price would be "+ washer.getPrice());
    }

    @Override
    public void setPrice(float amount) {
        washer.setPrice(amount);
    }
}
