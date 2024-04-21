import java.util.LinkedList;

import H8_linkedList.Node;

public class I4_mergeLinkList {

    public Node findMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while (fast!=null && fast.next !=null) {
            slow=slow.next;
            fast=fast.next.next;   
        }
        return slow;
    }

    public Node merge(Node head1,Node head2){
        Node mergeLL=new Node(-1);
        Node temp=mergeLL;
        while (head1 !=null && head2 !=null) {
            if(head1.data<= head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
            
        }
        while (head1 != null) {
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
            
        }
        while (head2 != null) {
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
            
        }
        return mergeLL.next;
    }

    public Node mergeSort(Node head){
        if(head ==null || head.next == null){
            return head;
        }
        //find mid
        Node mid= findMid(head);

        //find left and right half
        Node rightHead=mid.next;
        mid.next=null;
        Node lefthalf= mergeSort(head);
        Node righthalf=mergeSort(rightHead);
      

        //merge
        return merge(lefthalf,righthalf);


    }
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addFirst(3);
        l1.addFirst(4);
        l1.addFirst(5);

        System.out.println(l1);
        l1.head=l1.mergeSort(l1.head);
        System.out.println(l1);
    }
}
