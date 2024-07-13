public class J9_PartitionLIst {
    public static  class ListNode {
        ListNode next;
        int val;
        ListNode(){};
        ListNode(int val){this.val=val;};
        ListNode(int val,ListNode next){
            this.val=val;
            this.next=next;
        };
    }
    public ListNode partitionList(ListNode head , int k){
        ListNode lesshead=new ListNode(0);
        ListNode greaterhead=new ListNode(0);
        ListNode less=lesshead;
        ListNode greater=greaterhead;

        while(head != null){
            if(head.val < k){
                less.next=head;
                less=less.next;
            }else{
                greater.next=head;
                greater=greater.next;
            }
            head=head.next;
        }
        less.next=greaterhead.next;
        greater.next=null;
        return lesshead.next;
    }
    public static void printlist(ListNode head){
        while(head !=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        J9_PartitionLIst sol=new J9_PartitionLIst();
        ListNode h1=new ListNode(1);
        h1.next=new ListNode(2);
        h1.next.next=new ListNode(4);
        h1.next.next.next=new ListNode(3);
        h1.next.next.next.next=new ListNode(2);
        h1.next.next.next.next.next=new ListNode(5);
        int k=3;
        ListNode result=sol.partitionList(h1,k);
        printlist(result);
        
    }
}
