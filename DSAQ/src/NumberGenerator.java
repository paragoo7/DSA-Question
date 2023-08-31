public class NumberGenerator {

    private static boolean isNumberValid(int number, int[] digits) {
        while (number > 0) {
            int digit = number % 10;
            boolean validDigit = false;
            for (int d : digits) {
                if (digit == d) {
                    validDigit = true;
                    break;
                }
            }
            if (!validDigit) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        int m = 100;
        int n = 1000;
        int[] digits = {1, 4, 9};

        int count = 0;
        for (int i = m; i <= n; i++) {
            if (isNumberValid(i, digits)) {
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();

        System.out.println("Total count: " + count);
    }

}
