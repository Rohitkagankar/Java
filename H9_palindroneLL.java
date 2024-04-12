public class H9_palindroneLL {
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

    // add function
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // print function
    public void printLList() {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

     // find middle-----
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // middle=slow
    }

    // check function-----
    public boolean isPalindron() {
        if(head==null || head.next==null){
            return true;
        }
        // step 1 find middle
        Node mid = findMid(head);

        // step 2 - reverse right list
        Node prev = null;
        Node curr = mid;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        // check left and right ll
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;

        }
        return true;
    }

    public static void main(String[] args) {
        H9_palindroneLL l1 = new H9_palindroneLL();
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addFirst(3);
        l1.addFirst(2);
        l1.addFirst(1);
        l1.printLList();
        System.out.println(l1.isPalindron());
        H9_palindroneLL l2=new H9_palindroneLL();
        l2.addFirst(5);
        l2.addFirst(6);
        l2.addFirst(7);
        l2.addFirst(8);
        l2.addFirst(9);
        l2.addFirst(10);
        l2.printLList();
        System.out.println(l2.isPalindron());
        
    }
}
