package ro.cts.clase;

public class CarWash implements Wash {
    private int durationInHours;
    private float price;

    public CarWash(int durationInHours, float price) {
        this.durationInHours = durationInHours;
        this.price = price;
    }

    public float getPrice() {
        return this.price;
    }

    @Override
    public void showDescription() {
        System.out.println("This is a simple car wash and costs "+ this.price);
    }

    @Override
    public void setPrice(float amount) {
        this.price += amount;
    }
}
