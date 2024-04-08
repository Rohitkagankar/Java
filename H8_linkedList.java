//size of linked list---
public class H8_linkedList {
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
    public static int  size;
    //add first O(n)
    public void addFirst(int data){
        //create newnode
        Node newNode= new Node(data);
        size++;
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
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        //tail->next = newnode
        tail.next=newNode;
        
        //tail=newNode
        tail=newNode;
    }
    //print linked list O(n)
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
    //add a node at perticular index
    public void add(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int index=0;
        while (index<idx-1) {
            temp=temp.next;
            index++;      
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int removefirst(){
        if(size==0){
            System.out.println("LL is empty.");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val =head.data;
            head=tail=null;
            size=0;
            return val;
            
        }
        int val = head.data;
        head=head.next;
        size--;
        return val;
        
    }
    public int removeLast(){
        if (size==0) {
            System.out.println("ll is empty.");
        }else if(size==1){
            int val = head.data;
            head= tail= null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0; i<size-2; i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        size--;
        tail=prev;
        return val;
    }

    //search key at node index and return index---
    public static int iteSearch(int key){
        Node temp =head;
        int i=0;
        while (temp !=null) {
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;   
        }
        return -1;
    }
    public static int recHelper(Node head, int key){ //O(n)
    if(head==null){
        return -1;
    }
    if(head.data == key){
        return 0;
    }
    int idx = recHelper(head.next, key);

    if(idx==-1){
        return -1;
    }

    return idx+1;

    }
    
    public static int recSearch(int key){
        return recHelper(head,key);
    }

    //reverse linkedlist O(n)
    public static void revlinkedlist(){
        Node prev=null;
        Node curr=head;
        Node next;

        while (curr !=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;    
        }
        head=prev;

    }

    //delete nth from end
    public static void delnthFromEnd(int n){
        //fint size(length)
        int sz=0;
        Node temp=head;
        while (temp !=null) {
            temp=temp.next;
            sz++;
        }
        if(sz==n){
            head=head.next;
            return;
        }
        int i=1;
        int tofind=sz-n;
        Node prev=head;
        while (i<tofind) {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    public static void main(String[] args) {
        H8_linkedList l1=new H8_linkedList();
        l1.addFirst(2);
        l1.addFirst(1);
        l1.addLast(4);
        l1.addLast(5);
        l1.add(2,3);
        l1.printList();
        System.out.println(size);
        System.out.println(l1.removefirst());
        System.out.println(l1.removeLast());
        l1.printList();
        System.out.println(iteSearch(2));
        System.out.println(recSearch(3));
        l1.revlinkedlist();
        l1.printList();
        l1.delnthFromEnd(2);
        l1.printList();
    }
    
}