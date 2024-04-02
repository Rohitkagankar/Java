import java.util.*;

public class H2_ArrayList {
    public static void swapArrList(ArrayList<Integer> li, int idx1, int idx2){
        int temp= li.get(idx1);
        li.set(idx1, li.get(idx2));
        li.set(idx2, temp);


    }
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
        
        //make arraylist and print in reverse order
        ArrayList<Integer> li=new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        //print in reverse order
        for(int i=li.size()-1; i>=0; i--){
            System.out.print(li.get(i)+" ");
        }
        System.out.println();

        //find maximum value O(n)
        int max= Integer.MIN_VALUE;
        for(int i=0; i<li.size(); i++){
            // if(max<li.get(i)){
            //     max=li.get(i);
            // }
            max=Math.max(max, li.get(i));
        }
        System.out.println(max);

        //swap values 
        int idx1=1;
        int idx2=3;
        System.out.println(li);
        swapArrList(li, idx1, idx2);
        System.out.println(li);
        
        //Arraylist sort elements
        ArrayList<Integer> lista=new ArrayList<>();
        lista.add(3);
        lista.add(2);
        lista.add(8);
        lista.add(1);
        lista.add(5);

        //asending order
        Collections.sort(lista);
        System.out.println(lista);
        
        //desending order
        Collections.sort(lista, Collections.reverseOrder());
        System.out.println(lista);
    }
}
