import org.w3c.dom.Node;

public class I5_zigzagLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }
    public void addLast(int data){
        //create node
        Node newNode= new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        //tail->next = newnode
        tail.next=newNode;
        
        //tail=newNode
        tail=newNode;
    }
    public static void printList(){
        if(head==null){
            System.out.println("empty linked list.");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"=>");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void zigzag(){
        //find the mid--
        Node slow=head;
        Node fast=head.next;
        while (fast != null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;

        //reverse the list--
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;

        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node left=head;
        Node right=prev;
        Node nextL, nextR;

        while (left!=null && right!=null) {
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
            
        }
    }
    public static void main(String[] args) {
       I5_zigzagLL l1=new I5_zigzagLL();
       l1.addLast(5);
       l1.addLast(4);
       l1.addLast(3);
       l1.addLast(2);
       l1.addLast(1);
       l1.printList();

       l1.zigzag();
       l1.printList();
    }
}
