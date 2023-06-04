import java.util.Scanner;

public class PrimeNumberFactorial {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <=number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int factorial(int number) {
        int fact = 1;

        for (int i = 2; i <= number; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Prime numbers up to " + n + ":");

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " (Factorial: " + factorial(i) + ")");
                System.out.println();
            }
        }
    }
}
