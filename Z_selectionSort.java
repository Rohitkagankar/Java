public class Z_selectionSort {
    public static void SelectionSort(int array[]){
        for(int i=0; i<array.length-1; i++){
            int minPo=i;
            for(int j=i+1; j<array.length; j++){
                if(array[i]>array[j]){
                    minPo=j;
                }
            }
            int temp=array[minPo];
            array[minPo]=array[i];
            array[i]=temp;
        }
    }
    public static void pArray(int array[]){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[]={5,4,3,2,1,9,8,7,6};
        SelectionSort(array);
        pArray(array);
    }
}
