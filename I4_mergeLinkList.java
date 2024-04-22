// import java.util.LinkedList;
import java.util.*;
// import H8_linkedList.Node;

public class I4_mergeLinkList {

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

    public static Node findMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while (fast!=null && fast.next !=null) {
            slow=slow.next;
            fast=fast.next.next;   
        }
        return slow;
    }

    public static Node merge(Node head1,Node head2){
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

    public static Node mergeSort(Node head){
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
        I4_mergeLinkList l1=new I4_mergeLinkList();
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addFirst(3);
        l1.addFirst(4);
        l1.addFirst(5);

        l1.printList();
        l1.mergeSort(head);
        l1.printList();
    }
}
