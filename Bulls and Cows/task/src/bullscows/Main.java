package bullscows;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the length of the secret code:\n> ");
        String codeLengthInput = scanner.next();
        int codeLength, symbolsNumber;

        try {
            codeLength = Integer.parseInt(codeLengthInput);
        } catch (Exception e) {
            System.out.println("Error: \"" + codeLengthInput + "\" isn't a valid number.");
            return;
        }
        System.out.print("Input the number of possible symbols in the code:\n> ");
        String symbolsNumberInput = scanner.next();
        try {
            symbolsNumber = Integer.parseInt(symbolsNumberInput);
        } catch (Exception e) {
            System.out.println("Error: \"" + symbolsNumberInput + "\" isn't a valid number.");
            return;
        }

        if (symbolsNumber > 36) {
            System.out.println("Error: maximum number of possible symbols in the code is 36 (0-9, a-z)");
        } else if (codeLength <= 0) {
            System.out.println("Error: minimum length of the secret code is 1 symbol");
        } else if (codeLength <= symbolsNumber) {
            String code = getRandomNumber(codeLength, symbolsNumber);

            System.out.println("Okay, let's start a game!");
            int turnNumber = 1;
            boolean win = false;

            while (!win) {
                System.out.println("Turn " + turnNumber + ":");
                win = guessCode(code, codeLength);
                turnNumber++;
            }

            System.out.println("Congratulations! You guessed the secret code.");
        } else {
            System.out.println("Error: it's not possible to generate a code with a length of "
                    + codeLength + " with " + symbolsNumber
                    + " unique symbols.");
        }

    }

    public static String getRandomNumber(int codeLength, int numberOfSymbols) {
        StringBuilder options = new StringBuilder("0123456789");
        StringBuilder additionalOptions = new StringBuilder();
        char firstSymbol = 'a';

        for (int i = firstSymbol; i < firstSymbol + 36; i++) {
            additionalOptions.append((char) i);
        }
        options.append(additionalOptions);

        options.setLength(numberOfSymbols);

        String codeDescription;

        if (numberOfSymbols <= 10) {
            codeDescription = "(0-" + options.charAt(options.length() - 1) + ")";
        } else {
            codeDescription = "(0-9, " + firstSymbol + "-" + options.charAt(options.length() - 1) + ")";
        }

        StringBuilder result = new StringBuilder();
        Random random = new Random(42);
        int randomChoice;

        for (int i = 0; i < codeLength; i++) {
            randomChoice = random.nextInt(options.length());
            result.append(options.charAt(randomChoice));
            options.deleteCharAt(randomChoice);
        }

        System.out.println("The secret is prepared: " + "*".repeat(codeLength) + " " + codeDescription + ".");
        return result.toString();
    }

    public static boolean guessCode(String code, int codeLength) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("> ");
        String userAttempt = scanner.nextLine();

        int bulls = 0;
        int cows = 0;

        for (int i = 0; i < codeLength; i++) {
            if (userAttempt.charAt(i) == code.charAt(i)) {
                bulls++;
            } else if (code.contains(String.valueOf(userAttempt.charAt(i)))) {
                cows++;
            }
        }

        System.out.print("Grade: ");
        if (bulls == 0 && cows ==0) {
            System.out.println("None");
        } else if (bulls == 0) {
            System.out.println(cows + " cow" + (cows > 1 ? "s" : ""));
        } else if (cows == 0) {
            System.out.println(bulls + " bull" + (bulls > 1 ? "s" : ""));
        } else {
            System.out.println(bulls + " bull" + (bulls > 1 ? "s" : "")
                    + " and " + cows + " cow" + (cows > 1 ? "s" : ""));
        }

        return bulls == codeLength;
    }
}
