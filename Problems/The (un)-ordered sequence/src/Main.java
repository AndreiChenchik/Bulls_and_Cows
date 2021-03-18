import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userNumber = scanner.nextInt();
        int nextNumber;

        int diff = 0;
        int nextDiff;

        boolean isOrdered = true;

        while (true) {
            nextNumber = scanner.nextInt();
            if (nextNumber == 0) {
                break;
            }

            nextDiff = userNumber - nextNumber;

            if (nextDiff >= 0 && diff >= 0 || nextDiff <= 0 && diff <= 0) {
                diff = nextDiff;
                userNumber = nextNumber;
            } else {
                isOrdered = false;
                break;
            }
        }

        System.out.println(isOrdered);
    }
}