public class A_04_SearchingLL {
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

    // Searching via  itrSearch

    public int itrSearch(int key){
        Node temp = head;
        int i=0;

        while (temp!=null) {
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1;
    }

    // Recursive search
    public int helper(Node head, int key){
        if(head==null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx==-1){
            return -1;
        }

        return idx +1;
    }

    public int recSearch(int key){
        return helper(head, key);
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
    public static void main(String[] args){
        A_01_createLL ll = new A_01_createLL();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.print();

        System.out.println(ll.itrSearch(1));
        System.out.println(ll.recSearch(2));
    }


}
