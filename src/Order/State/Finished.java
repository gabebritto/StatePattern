package Order.State;

import Order.Order;

public class Finished implements OrderState {

    @Override
    public void nextState(Order order) {
        System.out.println("The Order was already finished.");
    }

    @Override
    public void previousState(Order order) {
        System.out.println("The Order was already finished.");
    }

}
