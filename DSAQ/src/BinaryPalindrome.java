public class BinaryPalindrome {
    public static boolean isBinaryPalindrome(int num) {
        String binaryNum = Integer.toBinaryString(num);
        String reversedBinaryNum = new StringBuilder(binaryNum).reverse().toString();

        return binaryNum.equals(reversedBinaryNum);
    }

    public static void main(String[] args) {
        int num = 219;

        if (isBinaryPalindrome(num)) {
            System.out.println("The binary number is a palindrome.");
        } else {
            System.out.println("The binary number is not a palindrome.");
        }
    }
}
