import java.util.Scanner;

public class RepeatingPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter s1: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter s2: ");
        String s2 = scanner.nextLine();

        String[] words = s2.split(" ");

        for (String word : words) {
            s1 = s1.replace(word, "");
        }

        s1 = s1.trim().replaceAll(" ", " ");


        System.out.println("Output: " + s1);
    }
}
