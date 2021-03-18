import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int busHeight = scanner.nextInt();
        int bridgeNumber = scanner.nextInt();
        boolean crashed = false;
        int bridgeHeight;

        for (int i = 1; i <= bridgeNumber; i++) {
            bridgeHeight = scanner.nextInt();
            if (bridgeHeight <= busHeight) {
                crashed = true;
                System.out.println("Will crash on bridge " + i);
                break;
            }
        }

        if (!crashed) {
            System.out.println("Will not crash");
        }
    }
}