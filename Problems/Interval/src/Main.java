import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        System.out.println(x > -15 && x <= 12 || x > 14 && x < 17 || x >= 19 ? "True" : "False");
    }
}