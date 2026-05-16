import java.util.HashSet;
import java.util.Set;

public class A05_Remove_Char {
        static String removeChars(String str1, String str2) {
        // code here
        Set<Character> strSet = new HashSet<>();
        for(char c : str2.toCharArray()){
            strSet.add(c);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(char c : str1.toCharArray()){
            if(!strSet.contains(c)){
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str1 = "computer";
        String str2 = "cat";

        System.out.println(removeChars(str1, str2));
    }
}
