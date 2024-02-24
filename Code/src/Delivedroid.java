import java.util.Scanner;

public class Delivedroid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int P = scanner.nextInt();
        int C = scanner.nextInt();
        scanner.close();

        int F = P * 50 - C * 10;
        if (P > C) {
            F += 500;
        }

        System.out.println(F);
    }
}
