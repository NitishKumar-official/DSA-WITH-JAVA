import java.util.LinkedList;

public class A_01_createLL {
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

    //removeFirst

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

    // Revese linked list

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //  deleteNthNodeFromEnd

    public void deleteNthNodeFromEnd(int n){
        int sz = 0;
        Node temp = head;
        while(temp!= null){
            temp = temp.next;
            sz++;
        }

        // if n is first node
        if(n==sz){
            head = head.next;
            return;
        }
        //sz-n
        int i =1;
        int iToFind = sz-n;
        Node prev = head;
        while (i<iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next= prev.next.next;
        return;

    }

    //Slow- fast approach to find mid of ll

    public Node findMind(Node head){
        Node slow = head;
        Node fast = head;

        while(fast !=null /*even(no of Node) */ && fast.next !=null /*odd(no of Node) */){
            slow = slow.next; //+1
            fast = fast.next.next; // +2
        }
        return slow; //slow id my middleNode
    }

    //Check Palindrome

    public boolean checkPalindrome(){
        if(head == null || head.next== null){
            return true;
        }

        //step 1 -> To find mid
        Node midNode = findMind(head);

        //step 2 -> Reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        //Step->3 - Check left half & Right half 

        while (right !=null) {
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
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
        A_01_createLL ll = new A_01_createLL();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(1);
        ll.addFirst(2);
        // ll.addLast(1);
        // ll.addLast(1);
        // ll.add_middle(2, 55);
        // System.out.println(ll.itrSearch(55));
        // System.out.println(ll.recSearch(55));
        // System.out.println(size);
        // ll.print();
        // // ll.reverse();
        // ll.deleteNthNodeFromEnd(2);
        ll.print();

        System.out.println(ll.checkPalindrome());
        

    }
}
