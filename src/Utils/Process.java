package Utils;

public class Process {
    public static void processing() {
        System.out.println("Processing...");
        for (int i = 1; i < 4; i++) {
            System.out.print(  "[*] ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n");
    }
}
