public class A_07_PalindromeLL {
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

    // Slow- fast approach to find mid of ll

    public Node findMind(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null /* even(no of Node) */ && fast.next != null /* odd(no of Node) */) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // slow id my middleNode
    }

    // Check Palindrome

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // step 1 -> To find mid
        Node midNode = findMind(head);

        // step 2 -> Reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        // Step->3 - Check left half & Right half

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
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
        A_01_createLL ll = new A_01_createLL();
        ll.addFirst(4);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(4);
        ll.print();
        System.out.println(ll.checkPalindrome());
    }

}
