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
    public static addfirst(int data){
        Node newnNode=new Node(data);
        if(head==null){
            System.out.println("Empty Doubly ll");
            return;
        }
        if(size==1){
            int val=head.data;
            head=head.next;
            head.prev=null;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
    }
}
