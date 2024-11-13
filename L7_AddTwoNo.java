class ListNode{
    int val;
    ListNode next;
    ListNode(){};
    ListNode(int val){this.val=val; this.next=null;}
    ListNode(int val,ListNode next){this.val=val; this.next=next;}
}

public class L7_AddTwoNo {
    public static ListNode addNum(ListNode l1,ListNode l2){
        ListNode result=new ListNode(0);
        ListNode q=result;
        int carry=0;
        
        while(l1 !=null || l2 != null){
            int sum=0+carry;
            if(l1 !=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2 !=null){
                sum+=l2.val;
                l2=l2.next;
            }
            carry=sum / 10;
            sum=sum %10;
            q.next=new ListNode(sum);
            q=q.next;
        }
        if(carry==1){
            q.next=new ListNode(1);
        }
        return result.next;
    }
    public static void printList(ListNode A){
        ListNode temp=A;
        while (temp != null) {
            System.out.print(temp.val+"=>");
            temp=temp.next;
            
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        ListNode l1=new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);

        ListNode l2=new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);

        printList(addNum(l1,l2));
    }
}
