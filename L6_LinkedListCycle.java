class ListNode{
    ListNode next;
    int val;
    ListNode(){};
    ListNode(ListNode next){ this.next=next;};
    ListNode(int val){this.val=val; this.next=null;};
    ListNode(int val,ListNode next){
        this.val=val;
        this.next=next;
    }
}
public class L6_LinkedListCycle {
    public static boolean isCycle(ListNode head){
        if(head==null || head.next==null) return false;
        ListNode slow=head;
        ListNode fast=head.next;

        while(fast != slow){
            if(fast == null || fast.next==null){
                return false;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return true;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=head.next;

        System.out.println(isCycle(head));
    }
}
