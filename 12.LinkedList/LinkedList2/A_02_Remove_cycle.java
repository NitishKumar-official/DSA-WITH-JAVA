public class A_02_Remove_cycle {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;


    public static void removeCycle(){
        // detect cycle

        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }   
        }

        if(cycle == false){
            return;
        }

        // find meeting point
        slow= head;
        Node prev = null; // last node
        while (slow!=fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //remove cycle -> last.next = null

        prev.next = null;

    }

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;  //+1
            fast = fast.next.next; //+2
            if(slow==fast){
                return true; // cycle detected
            }
        }
        return false; // cycle doesn't exist
    }

    // Display

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        A_02_Remove_cycle ll = new A_02_Remove_cycle();
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        // ll.print();
        System.out.println(isCycle());
        ll.removeCycle();
        System.out.println(isCycle());
    }
    
}
