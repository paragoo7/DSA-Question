import java.util.Scanner;

public class BinaryStringOperations {
    public static int operationsBinaryString(char[] str) {
        int len = str.length;
        int ans = str[0] - '0';

        for (int i = 1; i < len - 1; i += 2) {
            int j = i + 1;
            if (str[i] == 'A') {
                ans = ans & (str[j] - '0');
            } else if (str[i] == 'B') {
                ans = ans | (str[j] - '0');
            } else if (str[i] == 'C') {
                ans = ans ^ (str[j] - '0');
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] str = input.toCharArray();
        int result = operationsBinaryString(str);
        System.out.println(result);
    }
}
