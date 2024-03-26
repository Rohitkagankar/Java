public class G3_quickSort {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quickSort(int arr[],int id,int ed){
        if(id>=ed){
            return;
        }
        //pivot
        int pIdx=partition(arr,id,ed);
        quickSort(arr, id, pIdx-1);
        quickSort(arr, pIdx+1, ed);
    }
    public static int partition(int arr[],int id,int ed){
        int pivot=arr[ed];
        int i=id-1;

        for(int j=id; j<ed; j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        
        }
        i++;
        int temp=pivot;
        arr[ed]=arr[i];
        arr[i]=temp;
        return i;
        


    }
    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);

    }
}
