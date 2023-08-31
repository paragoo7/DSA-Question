import java.util.Scanner;

public class NearestPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int nearestPrime = findNearestPrime(number);
        System.out.println("The nearest prime number to " + number + " is " + nearestPrime);
    }

    public static int findNearestPrime(int number) {
        if (number <= 1) {
            return 2; // The nearest prime to 0 or 1 is 2
        }

        int lowerPrime = number - 1;
        int upperPrime = number + 1;

        while (true) {
            if (isPrime(lowerPrime)) {
                return lowerPrime;
            } else if (isPrime(upperPrime)) {
                return upperPrime;
            }
            lowerPrime--;
            upperPrime++;
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
