import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        for (int i = 0; i < n; i++) {
            switch (scanner.nextInt()) {
                case 5:
                    a++;
                    break;
                case 4:
                    b++;
                    break;
                case 3:
                    c++;
                    break;
                case 2:
                    d++;
                    break;
                default:
                    break;
            }
        }

        System.out.printf("%d %d %d %d", d, c, b, a);
    }
}