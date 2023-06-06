import java.util.Scanner;

public class PrimeOfPrime {
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

    public static int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    static void PofP(int x,int y ){
       int  count = 0;
        for (int i=x;i<=y;i++){
            if (isPrime(i)){
                int sum = getDigitSum(i);
                if (isPrime(sum)){
                    System.out.print(i+" ");
                    count++;

                }
            }
        }
        System.out.println();
        System.out.println("The number of Primes of primes are in the given range: "+count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Start point:");
        int x = sc.nextInt();
        System.out.println("enter the end point:");
        int y = sc.nextInt();
        PofP(x,y);


            }

    }


