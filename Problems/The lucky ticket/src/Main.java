import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] userNumber = scanner.next().toCharArray();

        int leftSide = Character.getNumericValue(userNumber[0])
                + Character.getNumericValue(userNumber[1])
                + Character.getNumericValue(userNumber[2]);
        int rightSide = Character.getNumericValue(userNumber[3])
                + Character.getNumericValue(userNumber[4])
                + Character.getNumericValue(userNumber[5]);
        if (leftSide == rightSide) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}