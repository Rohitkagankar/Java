public class Y_BubbleSort {
    public static void bubbleSort(int array[]){
        for(int i=0; i<array.length-1; i++){
            for(int j=0; j<array.length-1-i; j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }

    public static void pArray(int array[]){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[]={2,4,6,3,8,5};
        bubbleSort(array);
        pArray(array);
    }
}
