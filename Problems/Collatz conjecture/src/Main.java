import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        while (userNumber != 1) {
            System.out.print(userNumber + " ");
            if (userNumber % 2 == 0) {
                userNumber /= 2;
            } else {
                userNumber = userNumber * 3 + 1;
            }
        }
        System.out.print(userNumber);
    }
}