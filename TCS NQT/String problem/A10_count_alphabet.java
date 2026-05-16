public class A10_count_alphabet {
    static int Count(String S) {
        // code here
        int count=0;
        for (char ch : S.toCharArray()) {
             if ((ch >= 'a' && ch <= 'z') || 
                (ch >= 'A' && ch <= 'Z') ) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(Count("adjfjh23"));
    }
}
