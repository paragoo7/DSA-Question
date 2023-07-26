public class CharacterCounter {
    public static String compressString(String input) {
        StringBuilder comp = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                comp.append(input.charAt(i - 1));
                comp.append(count);
                count = 1;
            }
        }
        comp.append(input.charAt(input.length() - 1));
        comp.append(count);

        return comp.toString();
    }

    public static void main(String[] args) {
        String input = "aaaaaaaaaabbbbccccc";

        String compressedString = compressString(input);
        System.out.println("Compressed string: " + compressedString);
    }
}
