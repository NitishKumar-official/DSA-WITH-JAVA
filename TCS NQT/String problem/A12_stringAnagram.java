import java.util.HashMap;

public class A12_stringAnagram {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if (s1.length() != s2.length()) {
            return false;
        }
        
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char c: s1.toCharArray()){
            if(hm.containsKey(c)){
                hm.put(c, hm.get(c)+ 1);
            }else{
                hm.put(c, 1);
            }
        }
        for(char c: s2.toCharArray()){
            if(!hm.containsKey(c) || hm.get(c) == 0){
                return false;
            }else{
                hm.put(c, hm.get(c)-1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("geeks", "kseeg"));
    }
}
