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
    public static void main(String[] args) {
        H7_linkedList l1=new H7_linkedList();
        l1.addFirst(1);
        l1.addFirst(2);

    }
}
