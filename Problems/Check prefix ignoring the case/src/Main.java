import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        System.out.println(userInput.toLowerCase().startsWith("j"));
    }
}