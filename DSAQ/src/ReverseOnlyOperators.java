import java.util.Scanner;

public class ReverseOnlyOperators {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3 digit Number N: ");
        int N= sc.nextInt();

        int result;

        int num1 = N / 100;
        int num2 = (N / 10) %10;
        int num3 = (N % 10) ;

        result= num3*100+ num2*10+ num1;
        System.out.println(result);


    }
}
