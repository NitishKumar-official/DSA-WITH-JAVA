import java.util.Deque;
import java.util.LinkedList;

public class A_10_STACK_using_Deque {
    public static class  Stack {
        Deque<Integer>deque = new LinkedList<>();

        public  void push(int data){
            deque.addLast(data);
        }
        public  int pop(){
            return deque.removeLast();
        }
        public  int peek(){
            return deque.getLast();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(2);
        s.push(56);
        System.out.println(s.peek());
    }
    
}
