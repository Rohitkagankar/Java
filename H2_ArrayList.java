import java.util.ArrayList;

public class H2_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 =new ArrayList<>();
        ArrayList<Boolean> list2 =new ArrayList<>();

        //operations---
        // 1.add
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(9);
        list2.add(true);
        list2.add(false);

        System.out.println(list1);
        System.out.println(list2);

        //get
        int n1=list1.get(0);
        System.out.println(n1);

        //remove
        list1.remove(1);
        System.out.println(list1);

        //set 
        list1.set(0, 5);
        System.out.println(list1);

        //contains
        System.out.println(list1.contains(5));
        System.out.println(list1.contains(6));

        //size
        System.out.println(list1.size());
        for(int i=0; i<list1.size(); i++){
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();
        
    }
}
