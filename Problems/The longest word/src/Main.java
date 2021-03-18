import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        String longestString = "";

        for (String string : inputString.split(" ")) {
            longestString = longestString.length() < string.length() ? string : longestString;
        }

        System.out.println(longestString);
    }
}