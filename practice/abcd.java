import java.util.*;

public class abcd {

    public static void main(String[] args){
        StringBuilder str = new StringBuilder("a");


        // int n =(int)str.charAt(0);
        // n++;
        // char c = (char)n;
        // str.append(c);
        // System.out.println(str);

        // for(int j=0; str.length()<=5; j++){

        //     for(int i=0; i<=str.length() ; i++){
        //         int n =(int)str.charAt(i);
        //         n++;
        //         char c = (char)n;
        //         str.append(c);
        //         System.out.println(str);
        //         }

        // }

        char c = 'b';
        // char nextChar = (char) ((c - 'a' + 1) % 26 + 'a');
        int nextChar = (int)((c - 'a' + 1)%26 + 'a') ;
        System.out.println(nextChar);

    }
    
}
