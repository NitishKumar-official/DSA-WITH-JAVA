public class A07Compress_string {

    public static void Compress_string(String str) {

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count.toString());
            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        String str = "aaabbbbccccdddd";
        Compress_string(str);
    }

}
