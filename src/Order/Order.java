package Order;

import Order.State.*;
import Utils.Process;

public class Order {

    private OrderState state;

    public Order() {
        this.state = new Preparing();
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void nextStep() {
        Process.processing();
        this.state.nextState(this);
    }

    public void previousStep() {
        Process.processing();
        this.state.previousState(this);
    }
}
