public class I2_removeCycle {
    public static class  Node {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
       
    }
    public static Node head;
    public static Node tail;

    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while (fast != null && fast.next !=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(){
        //check for cycle exists
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while (head !=null && head.next != null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
            
        }
        if(cycle==false){
            return;
        }

        //find tail node
        Node prev=null;
        slow=head;
        while (slow!=fast) {
            prev=slow;
            slow=slow.next;
            fast=fast.next;            
        }

        //make tail of next null
        prev.next=null;
    }
    public static void main(String[] args) {
        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=temp;
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());

    }
}
