import java.util.Scanner;
public class GameQuestion {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number n: ");
        n = sc.nextInt();
        sc.close();
        int num= 0;
        int res = 0;
         int i=0;
        while (n>0){
            num= n%10;
            res=  res+ (9-num)*(int)Math.pow(10, i++);
            n=n/10;
        }
        System.out.println(res);

    }
}
