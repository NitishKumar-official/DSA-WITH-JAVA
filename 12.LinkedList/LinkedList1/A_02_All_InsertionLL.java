public class A_02_All_InsertionLL {
    public class Node {
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

    //addLast

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    //add_middle

    public void add_middle(int idx, int data) {

        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
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

    public static void main(String[] args){
        A_01_createLL ll = new A_01_createLL();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(1);
        ll.addLast(1);
        ll.add_middle(2, 55);
        ll.print();
    }

    
}
