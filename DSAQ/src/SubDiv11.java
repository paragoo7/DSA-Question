public class SubDiv11 {
    public static void main(String[] args) {
        long number = 55111228;
        findSubsequences(number);
    }

    private static void findSubsequences(long number) {
        String numString = String.valueOf(number);
        generateSubsequences(numString, "", 0);
    }

    private static void generateSubsequences(String numString, String subsequence, int index) {
        if (index >= numString.length()) {
            if (subsequence.length() > 1 && Long.parseLong(subsequence) % 11 == 0) {
                System.out.println(subsequence);
            }
            return;
        }

        generateSubsequences(numString, subsequence + numString.charAt(index), index + 1);
        generateSubsequences(numString, subsequence, index + 1);
    }
}
