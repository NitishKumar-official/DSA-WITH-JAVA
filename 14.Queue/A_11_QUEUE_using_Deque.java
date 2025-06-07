import java.util.Deque;
import java.util.LinkedList;

public class A_11_QUEUE_using_Deque {
    public static class  Queue {
        Deque<Integer>deque = new LinkedList<>();

        public  void push(int data){
            deque.addLast(data);
        }
        public  int pop(){
            return deque.removeFirst();
        }
        public  int peek(){
            return deque.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(2);
        q.push(56);
        System.out.println(q.peek());
    }
    
}
