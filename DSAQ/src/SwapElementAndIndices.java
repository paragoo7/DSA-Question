public class SwapElementAndIndices {
    public static void main(String[] args) {
        int[] arr = {3, 2, 0, 4, 1};
        int[] swappedArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            swappedArr[arr[i]] = i;
        }

        for (int x : swappedArr) {
            System.out.print(x + " ");
        }
    }
}
