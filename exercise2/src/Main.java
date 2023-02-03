import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        double log = 0.0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                log -= (1.0 / i);
            } else {
                log += (1.0 / i);
            }
        }
        System.out.println("The natural logarithm of 2 with " + n + " terms is: " + log);
    }
}