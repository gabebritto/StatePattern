package Order.State;

import Order.Order;

public class Cancelled implements OrderState{

    @Override
    public void nextState(Order order) {
        System.out.println("The Order was Cancelled. Create a New one to continue.");
    }

    @Override
    public void previousState(Order order) {
        System.out.println("The Order was Cancelled. Create a New one to continue.");
    }

}
