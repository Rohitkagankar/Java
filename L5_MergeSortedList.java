
class ListNode{
    int val;
    ListNode next=null;
    ListNode(){}
    ListNode(int val){this.val=val; this.next=null;}
    ListNode(ListNode next,int val){this.val=val; this.next=next;}
}

public class L5_MergeSortedList {
    public static ListNode mergeList(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode();
        ListNode curr=dummy;

        while(l1 != null && l2 !=null){
            if(l1.val <=l2.val){
                curr.next=l1;
                l1=l1.next;
            }else{
                curr.next=l2;
                l2=l2.next;
            }
            curr=curr.next;
        }
        if(l1 != null){
            curr.next=l1;
        }else{
            curr.next=l2;
        }
        return dummy.next;
    }
    public static void printList(ListNode A){
        ListNode temp=A;
        while (temp != null) {
            System.out.print(temp.val + "=>");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(4);

        ListNode l2=new ListNode(1);
        l2.next=new ListNode(3);
        l2.next.next=new ListNode(4);
        
        printList(mergeList(l1, l2));
        
    }
}
