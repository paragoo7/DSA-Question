import java.util.Arrays;
public class HyphenSorter {
    public static String sortHyphens(String input) {
        StringBuilder hyphens = new StringBuilder();
        StringBuilder letters = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (c == '-') {
                hyphens.append(c);
            } else {
                letters.append(c);
            }
        }

        return hyphens.toString() + letters.toString();
    }


    public static void main(String[] args) {
        String input = "He-llo-Wo-rld";
        String output = sortHyphens(input);
        System.out.println(output);
    }

}

