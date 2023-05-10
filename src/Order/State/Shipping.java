package Order.State;

import Order.Order;

public class Shipping implements OrderState{

    @Override
    public void nextState(Order order) {
        System.out.println("The packet has arrived the destination.");
        order.setState(new Delivered());
    }

    @Override
    public void previousState(Order order) {
        System.out.println("The Order is in Transport. Wait until the packet arrives to change state.");
    }

}
