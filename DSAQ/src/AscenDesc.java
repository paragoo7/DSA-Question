import java.lang.reflect.Array;
import java.util.Arrays;

public class AscenDesc {
    public static void main(String[] args) {
        int[] arr = {1, 7, 9, 8, 5, 4};
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {
            int newElement = arr[firstUnsortedIndex];

            int i;
            for (i = firstUnsortedIndex; i > 0 && arr[i - 1] > newElement; i--) {
                arr[i] = arr[i - 1];
            }

            arr[i] = newElement;
        }
        for (int k = arr.length - 1; k > arr.length / 2; k--) {
            if (arr[k] > arr[k - 1]) {
                int temp = arr[k];
                arr[k] = arr[k - 1];
                arr[k - 1] = temp;
            }

            for (int x : arr) {
                System.out.println(x);
            }


        }
    }
}



