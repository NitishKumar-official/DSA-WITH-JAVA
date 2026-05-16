import java.util.HashMap;

public class A05_arraySubset {
    public static void CheckSubset(int[] a, int[] b){
        boolean isSubset = false;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<a.length; i++){
            if(hm.containsKey(a[i])){
                hm.put(a[i], hm.get(a[i])+1);
            }else{
                hm.put(a[i], 1);
            }
        }

        for(int i=0; i<b.length; i++){
            if(hm.containsKey(b[i]) && hm.get(b[i])>=1){
                isSubset = true;
            }else{
                isSubset = false;
            }
        }
        if(isSubset){
            System.out.println("b is subset of a");
        }else{
            System.out.println("b is not subset of a");
        }
    }
    public static void main(String[] args) {
        int a[] = {11, 7, 1, 13, 21, 3, 7, 3};
        int b[] = {11, 3, 7, 1, 7,9};
        CheckSubset(a, b);
    }
}
