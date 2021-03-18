import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Random random = new Random(a + b);

        int result = n * a;

        for (int i = 0; i < n; i++) {
            result += random.nextInt(b - a + 1);
        }

        System.out.println(result);
    }
}