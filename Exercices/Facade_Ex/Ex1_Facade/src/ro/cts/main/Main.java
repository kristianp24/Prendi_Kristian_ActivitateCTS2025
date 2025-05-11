package ro.cts.main;

import ro.cts.clase.OrderFacade;

public class Main {
    public static void main(String[] args) {
        OrderFacade order = new OrderFacade();
        order.placeOrder();
    }
}