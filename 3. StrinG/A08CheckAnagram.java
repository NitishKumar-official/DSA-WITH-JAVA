import java.lang.reflect.Array;
import java.util.*;

public class A08CheckAnagram{

    public static boolean isAnagram(String str1, String str2){
        char[] charStr1 = str1.toCharArray();
        char[] charStr2 = str2.toCharArray();

        Arrays.sort(charStr1);
        Arrays.sort(charStr2);

        return Arrays.equals(charStr1, charStr2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check anagram");
        String str1 = sc.nextLine();
        System.out.println("Enter another string to check anagram");
        String str2 = sc.nextLine();

        if(isAnagram(str1, str2)){
            System.out.println("Both are anagram");
        }
        else{
            System.out.println("Both are not anagram");
        }
    }
/*input:
     str1 = anagram
     str2 = anagram
  output:
     true
 */

}
