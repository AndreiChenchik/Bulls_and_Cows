import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userString = scanner.nextLine();
        int counter = 0;
        char character = userString.charAt(0);

        for (int i = 0; i < userString.length(); i++) {
            if (character == userString.charAt(i)) {
                counter++;
            } else {
                System.out.print(character + "" + counter);
                character = userString.charAt(i);
                counter = 1;
            }
        }

        System.out.print(character + "" + counter);
    }
}

