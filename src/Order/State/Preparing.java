package Order.State;

import Order.Order;

public class Preparing implements OrderState{

    @Override
    public void nextState(Order order) {
        System.out.println("Packet has been sent to Shipping.");
        order.setState(new Shipping());;
    }

    @Override
    public void previousState(Order order) {
        System.out.println("The Order has been cancelled.");
        order.setState(new Cancelled());
    }

}
