import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveNumbers = (scanner.nextInt() > 0 ? 1 : 0)
                + (scanner.nextInt() > 0 ? 1 : 0)
                + (scanner.nextInt() > 0 ? 1 : 0);

        System.out.println(positiveNumbers == 1);
    }
}