public class H7_linkedList {
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

    //add first O(n)
    public void addFirst(int data){
        //create newnode
        Node newNode= new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        //newNode->next=head
        newNode.next=head;

        //head=newNode
        head=newNode;
    }

    //add last node O(n)
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
    //print linked list
    public void printList(){
        if(head==null){
            System.out.println("empty linked list.");
            return;
        }
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"=>");
            temp=temp.next;            
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        H7_linkedList l1=new H7_linkedList();
        l1.addFirst(2);
        l1.addFirst(1);
        l1.addLast(3);
        l1.addLast(4);
        l1.printList();

    }
}
