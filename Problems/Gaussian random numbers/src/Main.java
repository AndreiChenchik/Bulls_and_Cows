import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int k = scanner.nextInt();
        double n = scanner.nextDouble();
        double m = scanner.nextDouble();

        boolean found = false;

        while (!found) {
            Random random = new Random(k);

            for (int i = 0; i < n; i++) {
                found = random.nextGaussian() <= m;
                if (!found) {
                    break;
                }
            }

            k++;
        }

        System.out.println(k - 1);
    }
}