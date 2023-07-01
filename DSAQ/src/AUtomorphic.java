import java.util.Scanner;

public class AUtomorphic {
    public static boolean isAutomorphic(int num){
        int square = num *num;
        while (num>0){
            if( num%10 !=square%10) return false;
            num/=10;
            square/=10;

            }
        return true;
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println(isAutomorphic(76) ? "Automorphic" : "Not Automorphic");
}
}


