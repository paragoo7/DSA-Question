import java.util.Arrays;

public class ArrayPairs {
    public static void printPairs(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            System.out.println(arr[i] + " " + arr[n - 1 - i]);
        }
        if (n % 2 == 1) {
            System.out.println(arr[n / 2] + " 0");
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 12, 4};
        printPairs(array);
    }
}
