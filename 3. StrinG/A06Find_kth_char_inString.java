public class A06Find_kth_char_inString {

    public static char KthCharacter(int k){
        String word = "a";
        while(word.length()<k){
            StringBuilder nextChar = new StringBuilder("");
            for(char c:word.toCharArray()){
                char next = (char)((c - 'a' +1)%26 + 'a');
                nextChar.append(next);
            }
            word += nextChar.toString();
        }
        System.out.println(word);
        return word.charAt(k-1);
    }

    public static void main(String[] args){
        int k=5;
        System.out.println("char at k="+k+" is: "+KthCharacter(k));
    }
    
}
