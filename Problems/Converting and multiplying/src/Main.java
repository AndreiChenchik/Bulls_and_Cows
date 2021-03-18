import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = scanner.next();
            if ("0".equals(userInput)) {
                break;
            }

            try {
                System.out.println(Integer.parseInt(userInput) * 10);
            } catch (Exception e) {
                System.out.println("Invalid user input: " + userInput);
            }
        }
    }
}