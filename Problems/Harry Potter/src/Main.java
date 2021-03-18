import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String house = scanner.nextLine();
        String meaning;

        switch (house) {
            case "gryffindor":
                meaning = "bravery";
                break;
            case "hufflepuff":
                meaning = "loyalty";
                break;
            case "slytherin":
                meaning = "cunning";
                break;
            case "ravenclaw":
                meaning = "intellect";
                break;
            default:
                meaning = "not a valid house";
                break;
        }

        System.out.println(meaning);
    }
}