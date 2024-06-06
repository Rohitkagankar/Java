public class I6_DoubleLL {
    public static class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
        public static Node head;
        public static Node tail;
        public static int size;

        public static void addFirst(int data){
            Node newNode=new Node(data);
            size++;
            if(head==null){
                head=tail=newNode;
                return;
            }
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }

        public static void printList(){
            if(head==null){
                System.out.println("empty linked list");
                return;
            }
            Node temp= head;
            while (temp!= null) {
                System.out.println(temp.data+"=>");
                temp=temp.next;
            }
            System.out.println("null");

        }
    }
    public static void main(String[] args) {
        I6_DoubleLL dll= new I6_DoubleLL();
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.printList();
    }
}
