import java.util.*;

public class A_04_ReverseString {
    public static String reverseString(String str){
        Stack<Character>s = new Stack<>();
        int idx=0;
        while (idx<str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder sc = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            sc.append(curr);
        }
        return sc.toString();

    }

    public static void main(String[] args) {
        String str = "rana";
        System.out.println(reverseString(str));
    }
    
}
