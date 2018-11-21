import java.util.concurrent.TimeUnit;

public class Utilities {

    public static void delay() {
        try {
            Thread.sleep(500);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }

    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
