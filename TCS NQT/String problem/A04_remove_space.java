

public class A04_remove_space {

        public static String removeVowels(String str) {

        // Build new string without vowels
        StringBuilder newString = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c!=' ') {
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

