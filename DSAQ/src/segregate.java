import java.util.*;
import java.util.Arrays;


public class segregate {


    static void segregate0and1(int arr[], int n)
    {

        int count = 0;


        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)


                count++;
        }


        for (int i = 0; i < count; i++)
            arr[i] = 0;


        for (int i = count; i < n; i++)
            arr[i] = 1;
    }

    // Function to print segregated array
    static void print(int arr[], int n)
    {
        System.out.print("Array after segregation is ");

        // Iteration over array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }


    public static void main(String[] args)
    {

        int arr[] = new int[] { 0, 1, 0, 1, 1, 1 };


        int n = arr.length;
        segregate0and1(arr, n);
        print(arr, n);
    }
}
