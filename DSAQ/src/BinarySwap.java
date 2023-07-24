public class BinarySwap {
    public static void main(String[] args) {
        int n = 100;

        String binary = Integer.toBinaryString(n);


        while (binary.length() < 8) {
            binary = "0" + binary;
        }

        char[] binaryArray = binary.toCharArray();


        for (int i = 0; i < 4; i++) {
            char temp = binaryArray[i];
            binaryArray[i] = binaryArray[i + 4];
            binaryArray[i + 4] = temp;
        }

        String swappedBinary = new String(binaryArray);
        int swappedNumber = Integer.parseInt(swappedBinary, 2);

        swappedNumber = Integer.parseInt(Integer.toBinaryString(swappedNumber));

        System.out.println("Original number: " + n);
        System.out.println("Swapped number: " + swappedNumber);
    }
}
