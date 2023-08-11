import java.util.Scanner;

public class countthedigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.print(count(num));
    }
    public static int count(int num) {
        int count = 0, a = 0, n = num;
        while (n != 0) {
            a = n % 10;
            if (num % a == 0) {
                count++;
            }
            n/= 10;
        }
        return count;
    }
}
