import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poleHeight = scanner.nextInt();
        int upDaily = scanner.nextInt();
        int downDaily = scanner.nextInt();

        System.out.println((int)Math.ceil(((float)poleHeight - upDaily) / (upDaily - downDaily) + 1));
    }
}