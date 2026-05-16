import java.util.HashMap;
import java.util.Set;

public class A10_countFrequency {

    public static void counFreq(int arr[]){
        int n = arr.length;

        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<n; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i], 1);
            }
        }

       Set<Integer> keys = hm.keySet();
        // System.out.println(keys);

        for(int k : keys){
            System.out.println("keys= "+k+" value= "+hm.get(k));
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
        counFreq(arr);
    }
}
