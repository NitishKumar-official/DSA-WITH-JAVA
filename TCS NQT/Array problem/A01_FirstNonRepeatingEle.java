import java.util.*;

public class A01_FirstNonRepeatingEle {

public static int firstNonRepeating(int[] arr) {
        int n = arr.length;
        // for(int i=0; i<n; i++){
        //     int j;
        //     for(j=0; j<n; j++){
        //         if(i!=j && arr[i]==arr[j])
        //         break;
        //     }
        //     if(j==n){
        //         return arr[i];
        //     }
        // }
        // return 0;

        HashMap<Integer, Integer> hm = new HashMap<>();
                // Insert all array elements in hash
        // table

        // Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
            else {
                hm.put(arr[i], 1);
            }
        }
        // Traverse array again and return
        // first element with count 1.
        for (int i = 0; i < n; i++)
            if (hm.get(arr[i]) == 1)
                return arr[i];
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {-1, 2, -1, 3, 0};
        System.out.println(firstNonRepeating(arr));
    }
}
