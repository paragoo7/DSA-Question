import java.util.Scanner;
public class FactorsSmall {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number A :");
        int A =sc.nextInt();
        int arr[] =new int[100];
        if(A<10){
            A+=10;
        }
        for (int i=2; i<A; i++){
            if (A%i==0){
                System.out.print(i+"|__ ");
                A/=i;
                i=2;
                System.out.println(A+" ");

                }

            }

        }
    }

