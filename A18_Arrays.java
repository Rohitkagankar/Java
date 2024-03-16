import java.util.*;
public class A18_Arrays {

    //mark update in array-------
    public static void update(int m[],int nonchange){
        nonchange=10;
        for(int i=0; i<m.length; i++){
            m[i]=m[i]+1;
        }
    }

    //to find key-------
    public static int linearSea(int array[],int key){
        for(int i=0; i<array.length; i++){
            if(array[i]==key){
                return i;
            }
        }
        return -1;
    }

     //to find fruit-----
    public static int linearSearch(String Fruits[],String fkey){
        for(int i=0; i<Fruits.length; i++){
            if(Fruits[i]==fkey){
                return i;
            }
        }
        return -1;
    }


    //TO find largest no in array
    public static int largest(int array[],int large){
        int small=Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++){
            if(array[i]>large){
                large=array[i];
            }
            if(small>large){
                small=large;
            }
        }
        System.out.println("Smallet no is: "+small);
        return large;
    }

    public static void main(String[] args) {
        //mark update in array-------
        int marks[]={97,98,99};
        int nonchange=5;
        update(marks,nonchange);
        System.out.println(nonchange);
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();

        //to find key-------
        int array[]={1,2,4,5,6,7,8,12,14,15,19};
        int key=12;
        int index=linearSea(array, key);
        if(index==-1){
            System.out.println("key is not found.");
        }else{
            System.out.println("key is at index "+index);
        }
       
        //to find fruit-----
        String Fruits[]={"mango","apple","banana","peru","orange"};
        String fkey="peru";
        int ind = linearSearch( Fruits, fkey);
        if(ind==-1){
            System.out.println("key is not found.");
        }else{
            System.out.println("Fruit is at index "+ind);
        }

        //TO find largest no in array
        int arr[]={11,23,24,100,54,64,24,97,43,98,32,21};
        int large=Integer.MIN_VALUE;  // -infinity
        int lar=largest(arr, large);
        System.out.println("largest no is " +lar);
    }

}
