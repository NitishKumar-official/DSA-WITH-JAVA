public class A08_SumOfNumbersInString {
    // Function to calculate sum of all numbers present in a string.
    public static int findSum(String s) {
        String temp = "0";

        // holds sum of all numbers present in the string
        int sum = 0;

        // read each character in input string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // if current character is a digit
            if (Character.isDigit(ch))
                temp += ch;

            // if current character is an alphabet
            else {
                // increment sum by number found earlier
                // (if any)
                sum += Integer.parseInt(temp);

                // reset temporary string to empty
                temp = "0";
            }
            
        }
        return sum + Integer.parseInt(temp);
    }

    public static void main(String[] args) {
        String s = "1abc23";
        System.out.println(findSum(s));
    }
}
