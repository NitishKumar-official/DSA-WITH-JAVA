import java.util.*;
public class A01_createHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        //insert
        hm.put("rana",50);
        hm.put("baigan",500 );

        System.out.println(hm);

        //get
        int price = hm.get("rana");
        System.out.println(price);

        //containsKey-(1)

        System.out.println(hm.containsKey("rana"));
        System.out.println(hm.containsKey("raja"));

        //remove

        System.out.println(hm.remove("rana"));
        System.out.println(hm);

        // size
        System.out.println(hm.size());

        hm.clear();
        System.out.println(hm);
    }
}
