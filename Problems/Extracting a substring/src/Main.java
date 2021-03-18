import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userString = scanner.nextLine();
        int startSubstring = scanner.nextInt();
        int endSubstring = scanner.nextInt();

        System.out.println(userString.substring(startSubstring, endSubstring + 1));
    }
}