public class CharacterMultiplier {
    public static String expandString(String input) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < input.length()) {
            char ch = input.charAt(i++);
            int count = 0;
            while (i < input.length() && Character.isDigit(input.charAt(i))) {
                count = count * 10 + (input.charAt(i) - '0');
                i++;
            }
            for (int j = 0; j < count; j++) {
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String input = "a3b4c5";
        String output = expandString(input);
        System.out.println(output);
    }
}
