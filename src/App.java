import java.util.Scanner;

import Order.Order;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the test Flow:\n1-Without previousStep\n2-Retrieving the packet after Delivered\n3-Cancelling the Order in Preparing\n4-Retrieving the packet and finishing flow");
        String answer = scanner.nextLine();

        try {
            int value = Integer.parseInt(answer);
            doTest(value);
        }
        catch (NumberFormatException e ) {
            System.out.println("Digite apenas Números!");
            return;
        }
    }

    private static void doTest(int value) {
        System.out.println("Order created! Preparing product.");
        //Starts in Preparing when Object Created
        Order order = new Order();
        switch (value) {
            case 1:
                // Order goes to Shipping
                order.nextStep();
                // Now goes to Delivered
                order.nextStep();
                // Then the Order state changes to Finished
                order.nextStep();
                // Try to nextStep in finished
                order.nextStep();
                break;
            case 2:
                // Order goes to Shipping
                order.nextStep();
                // Now goes to Delivered
                order.nextStep();
                // Then Order comeback to Preparing
                order.previousStep();
                break;
            case 3:
                //Order goes to Cancelled
                order.previousStep();
                //Trying to change Cancelled order state
                order.nextStep();
                break;
            case 4:
                // Order goes to Shipping
                order.nextStep();
                // Now goes to Delivered
                order.nextStep();
                // Then Order comeback to Preparing
                order.previousStep();
                // Finally follows the normal flow
                order.nextStep();
                order.nextStep();
                order.nextStep();
                // Trying to nextStep in Finished Order
                order.nextStep();
                break;
            default:
                System.out.println("Value mismatch in menu options!");
        }

    }
}
