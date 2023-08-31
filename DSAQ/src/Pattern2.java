public class Pattern2 {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 1; i <= n; i += 2) {
            String binary = Integer.toBinaryString(i);
            System.out.println(binary);
        }
    }
}
