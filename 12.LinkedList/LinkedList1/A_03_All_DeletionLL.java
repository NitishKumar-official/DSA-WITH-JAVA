public class A_03_All_DeletionLL {
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

    // removeFirst

    public int removeFirst() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // removeLast

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // Remove from between of the linked list

    public int remove_middle(int idx) {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid index");
            return Integer.MIN_VALUE;
        }
        if (idx == 0) {
            // remove head
            int val = head.data;
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
            return val;
        }

        Node prev = head;
        for (int i = 0; i < idx - 1; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = prev.next.next;

        // if we deleted the last node, update tail
        if (idx == size - 1) {
            tail = prev;
        }

        size--;
        return val;
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
    public static void main(String[] args) {
        A_01_createLL ll = new A_01_createLL();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.print();

        //remove

        System.out.println("remove first");
        ll.removeFirst();
        ll.print();
        System.out.println("remove from last");
        ll.removeLast();
        ll.print();
        System.out.println("remove from middle");
        ll.remove_middle(1);
        ll.print();
    }
}

