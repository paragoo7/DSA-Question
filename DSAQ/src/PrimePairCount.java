
import java.util.Scanner;
public class PrimePairCount {
    // Function to check if given number is prime numbers
    public static boolean isPrime(int N)
    {
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0)
                return false;
        }
        return true;
    }

    //fu'n to print all the prime nos in given range by diff as C
    public static void getPrimePairs(int a , int b, int c){
        int count =0;

    for(int i= a; i <=b; i++ ) {
        if (isPrime(i)&&isPrime(i+c)){
            count++;
        }
    }
    System.out.println(count);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range Upper and Lower Limit: ");
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c=6;
        System.out.println("The number of pairs is:");
        getPrimePairs(a, b, c);

    }
}
