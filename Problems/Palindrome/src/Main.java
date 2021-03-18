import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        String reverseInput = new StringBuilder(userInput).reverse().toString();

        System.out.println(userInput.equals(reverseInput) ? "yes" : "no");

    }
}