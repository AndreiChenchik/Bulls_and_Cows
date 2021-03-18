import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amount = scanner.nextDouble();
        double percent = scanner.nextDouble();
        double goal = scanner.nextDouble();

        int years = (int) Math.ceil(Math.log(goal / amount) / Math.log((100 + percent) / 100));

        System.out.println(years);
    }
}