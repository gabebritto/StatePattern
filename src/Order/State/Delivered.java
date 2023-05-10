package Order.State;

import Order.Order;

public class Delivered implements OrderState{

    @Override
    public void nextState(Order order) {
        System.out.println("The Order has been finished. Don't forget to put your rating to help the others choose.");
        order.setState(new Finished());
    }

    @Override
    public void previousState(Order order) {
        System.out.println("The Order has been sent back to Store.");
        order.setState(new Preparing());
    }

}
