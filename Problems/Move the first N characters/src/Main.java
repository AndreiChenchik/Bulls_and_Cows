import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userString = scanner.next();
        int userNumber = scanner.nextInt();

        if (userNumber > userString.length()) {
            System.out.println(userString);
        } else {
            System.out.println(userString.substring(userNumber) + userString.substring(0, userNumber));
        }

    }
}