
public class A01Palindrome {

    public static boolean checkPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String str = "raacecar";
        Boolean str1 = checkPalindrome(str);
        if (str1) {
            System.out.println("it is palindrome");
        } else {
            System.out.println("it is not palindrome");
        }
    }

}