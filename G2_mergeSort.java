public class G2_mergeSort {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[],int st, int ed){
        if(st>=ed){
            return;
        }
        int mid=(st)+(ed-st)/2; //mid element
        mergeSort(arr, st, mid); //left subarray
        mergeSort(arr, mid+1, ed);  //right subarray

        merge(arr, st, mid, ed);
    }
    public static void merge(int arr[],int st, int mid,int ed){
        int temp[]=new int[ed-st+1];
        int left=st; //iterator for left
        int right=mid+1;  //iterator for right 
        int k=0;     //iterator for temp[]

        while (left<=mid && right <= ed) {
            if(arr[left]<=arr[right]){
                temp[k]=arr[left];
                left++;
            }else{
                temp[k]=arr[right];
                right++;
            }
            k++;
        }
        //for left remaining elements
        while (left<=mid) {
            temp[k++]=arr[left++];
        }
        //for right remaining elements
        while (right<=ed) {
            temp[k++]=arr[right++];
        }

        //copy temp to original arr
        for(int i=0, j=st; i<temp.length; i++,j++){
            arr[j] = temp[i];
        }

    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
