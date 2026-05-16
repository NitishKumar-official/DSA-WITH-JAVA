public class A06_Remove_Special_char{
    public static String removeSpecialCharacter(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                sb.append(c);
            }
        }
        if (sb.length() == 0) {
            return "-1";  // ✅ return string, not int
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String S = "$Gee*k;s..fo, r'Ge^eks?";
        System.out.println(removeSpecialCharacter(S));
    }
}