import java.util.*;

public class A03pairs_in_array {

    public static void make_pair(int numbers[]){
        for(int i=0; i<numbers.length; i++)
        {
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++)
            {
                System.out.print("("+ curr +"," + numbers[j]+")");
            }
            System.out.println();
        }
        
    }


    public static void main(String[] args) {
    int numbers[] = {5,6,8,4,3,6,9};
    make_pair(numbers); 
    }

}
