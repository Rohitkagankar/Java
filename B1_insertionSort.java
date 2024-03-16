public class B1_insertionSort {
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr=arr[i];
            int pre=i-1;
            while (pre>=0 && arr[pre]>curr) {
                arr[pre+1]=arr[pre];
                pre--;   
            }
            arr[pre+1]=curr;
        }
    }

    public static void pArray(int array[]){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        insertionSort(arr);
        pArray(arr);

    }
}
