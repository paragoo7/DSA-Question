import java.util.Scanner;

public class CyclicPrimeNumber {
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number;
        int digits = (int) Math.log10(number) + 1;
        boolean isCyclic = true;

        for (int i = 0; i < digits; i++) {
            if (!isPrime(temp)) {
                isCyclic = false;
                break;
            }

            int lastDigit = temp % 10;
            temp = (int) (lastDigit * Math.pow(10, digits - 1)) + (temp / 10);
        }

        if (isCyclic) {
            System.out.println(number + " is a cyclic number.");
        } else {
            System.out.println(number + " is not a cyclic number.");
        }
    }
}
