public class A_01_Cycle_Detection {
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

    // addFirst

    public void addFirst(int data) {
        // step1 - create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2 - newNode-> next = head
        newNode.next = head;
        // step3 - head=newNode
        head = newNode;
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
        A_01_Cycle_Detection ll = new A_01_Cycle_Detection();
        // ll.addFirst(4);
        // ll.addFirst(2);
        // ll.addFirst(2);
        // ll.addFirst(4);

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        // ll.print();
        System.out.println(ll.isCycle());
    }

}

