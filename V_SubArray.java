/**
 * V_SubArray
 */
public class V_SubArray {
    public static void subArray(int array[]){
        int total=0;
        for(int i=0; i<array.length; i++){
            //i
            for(int j=i; j<array.length; j++){
                //j
                for(int k=i; k<=j; k++){
                    System.out.print(array[k]+" ");  
                }
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total pairs are : "+total);
    }

    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        subArray(array);
    }
}