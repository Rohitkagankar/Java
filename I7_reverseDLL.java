public class I7_reverseDLL {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size;

    public static void addfirst(int data){
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
    public static void printDll(){
        if(head==null){
            System.out.println("Doubly ll is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<=>");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while (curr != null) {
            next=curr.next;
            curr.next=prev;
            curr.prev=next;

            prev=curr;
            curr=next;
            
        }
        head=prev;
    }
    public static void main(String[] args) {
        I7_reverseDLL l1=new I7_reverseDLL();
        l1.addfirst(5);
        l1.addfirst(4);
        l1.addfirst(3);
        l1.addfirst(2);
        l1.addfirst(1);
        l1.printDll();
        l1.reverse();
        l1.printDll();
        
    }
}
