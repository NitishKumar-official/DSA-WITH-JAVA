import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class A_04_Queue_using_JCF {
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();

        // queue ek interface isliye iska koi object
        //nhi bnaya jata hai 
        // isko linkelist ya arraydeque class se implement krte h

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
            
        }
    }
    
}
