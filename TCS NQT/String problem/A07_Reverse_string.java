public class A07_Reverse_string {
    public static String reverseString(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            sb.append(c);
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String  s = "Geeks";
        System.out.println(reverseString(s));
    }
}
