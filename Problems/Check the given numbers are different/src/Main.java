import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int x3 = scanner.nextInt();

        System.out.println(!(x1 == x2 || x1 == x3 || x2 == x3));
    }
}