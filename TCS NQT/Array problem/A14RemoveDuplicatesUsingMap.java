import java.util.*;

public class A14RemoveDuplicatesUsingMap {

    public static void removeDuplicates(int[] arr) {
        // Use LinkedHashMap to preserve insertion order
        Map<Integer, Boolean> map = new LinkedHashMap<>();
        ArrayList<Integer>al = new ArrayList<>();

        // Fill map (keys are unique)
        for (int num : arr) {
            map.put(num, true);  // value doesn't matter
        }

        // Print unique elements
        for (int key : map.keySet()) {
            // System.out.print(key + " ");
            al.add(key);
        }

        for(int i =0; i<al.size();i++){
            System.out.print(al.get(i));
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 4, 3, 2, 5, 1};
        removeDuplicates(arr);
    }
}
