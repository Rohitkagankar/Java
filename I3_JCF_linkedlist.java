import java.util.LinkedList;
public class I3_JCF_linkedlist {
    public static void main(String[] args) {
        LinkedList <Integer> l1 = new LinkedList<>();
        l1.addFirst(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        System.out.println(l1);
        l1.removeLast();
        l1.removeFirst();
        System.out.println(l1);
    }
}
