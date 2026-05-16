import java.util.*;

public class Main{

    public static int greet(int arr[]){
            HashMap<Integer, Integer> hm = new HashMap<>();
            int n = arr.length;
            System.out.println(n);

            for(int i=0; i<n; i++){
                if(hm.containsKey(arr[i])){
                    hm.put(arr[i], hm.get(arr[i])+1);
                }
                else{
                    hm.put(arr[i], 1);
                }
            }

            for(int i=0; i<n; i++){
                if(hm.get(arr[i])==1){
                    return arr[i];
                }
            }

            return 0;
        }
    
    public static void main(String args[]){
        int arr[] = {1,2,1,3};
        System.out.println(greet(arr));
        
    }
}