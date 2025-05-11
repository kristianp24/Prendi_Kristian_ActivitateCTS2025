package ro.cts.clase;

public class OrderFacade {

    public void placeOrder(){
        Kitchen kitchen = new Kitchen();
        Bar bar = new Bar();
        BillingSystem bill = new BillingSystem();

        kitchen.getCommand();;
        bar.getDrinkCommand();
        bill.createBill();
    }
}
