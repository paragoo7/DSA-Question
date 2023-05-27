import java.util.*;
public class SmallLargeSum {

    public static int smalllargesum(int arr[]){
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        for (int i=0; i< arr.length; i++){
            if (i%2==0){
                even.add(arr[i] );
            }else {
                odd.add(arr[i] );
            }
        }
        Collections.sort(even);
        Collections.sort(odd);

        return  even.get(even.size()-2)+ odd.get(1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array followed by the elements: ");
        int n = sc.nextInt();
        int arr[] =new int[n];
        for (int i=0;i< arr.length;i++)
            arr[i] = sc.nextInt();

        System.out.println("Sum is :"+ smalllargesum(arr));

    }
}
