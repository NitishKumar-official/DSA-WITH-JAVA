import java.util.LinkedList;

public class A_03_BuiltIn_LL {
    public static void main(String[] args) {
        LinkedList<Integer>ll = new LinkedList<>();
        ll.add(5);
        ll.addFirst(4);
        ll.addLast(8);
        System.out.println(ll);

        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);

       System.out.println( ll.size());

       


    }
    
}
