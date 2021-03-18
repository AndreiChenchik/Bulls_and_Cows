import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();

        String review;

        if (h < a) {
            review = "Deficiency";
        } else if (h > b) {
            review = "Excess";
        } else {
            review = "Normal";
        }

        System.out.println(review);
    }
}