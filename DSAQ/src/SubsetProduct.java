import java.util.Arrays;

public class SubsetProduct {
    public static int findMaxSubsetProduct(int[] array, int subsetSize) {
        if (array == null || array.length < subsetSize) {
            throw new IllegalArgumentException("Invalid array or subset size");
        }

        int n = array.length;
        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < n - subsetSize + 1; i++) {
            int product = array[i];


            for (int j = i + 1; j < i + subsetSize; j++) {
                product *= array[j];
            }

            maxProduct = Math.max(maxProduct, product);
        }

        return maxProduct;
    }

    public static void main(String[] args) {
        int[] array = {-6, -8, 10, -1, 5};
        int subsetSize = 3;

        int maxProduct = findMaxSubsetProduct(array, subsetSize);
        System.out.println("Max Product: " + maxProduct);
    }

}
