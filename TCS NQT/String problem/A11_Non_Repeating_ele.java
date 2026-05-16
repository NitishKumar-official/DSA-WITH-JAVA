import java.util.HashMap;

public class A11_Non_Repeating_ele{

    public static char nonRepeatingChar(String str){
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char c: str.toCharArray()){
            if(hm.containsKey(c)){
                hm.put(c, hm.get(c)+ 1);
            }else{
                hm.put(c, 1);
            }
        }

        for(char c: str.toCharArray()){
            if(hm.get(c)==1){
                return c;
            }
        }
        return '$';
    }

    public static void main(String[] args) {
        String s = "aabbccc";
        System.out.println(nonRepeatingChar(s));
    }
}