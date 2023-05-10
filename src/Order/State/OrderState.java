package Order.State;

import Order.Order;

public interface OrderState {
    void nextState(Order order);
    void previousState(Order order);
}
