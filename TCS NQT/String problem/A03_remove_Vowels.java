import java.util.HashSet;
import java.util.Set;

public class A03_remove_Vowels {

        public static String removeVowels(String str) {
        String vowels = "aeiouAEIOU";
        Set<Character> vowelSet = new HashSet<>();

        // Add all vowels to the set
        for (char c : vowels.toCharArray()) {
            vowelSet.add(c);
        }

        // Build new string without vowels
        StringBuilder newString = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (!vowelSet.contains(c)) {
                newString.append(c);
            }
        }

        return newString.toString();
    }
    public static void main(String[] args) {
        String str =  "welcome to geeksforgeeks";
        System.out.println(removeVowels(str));
    }
}
