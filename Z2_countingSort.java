public class Z2_countingSort {
    public static void countSort(int arr[]){
        int larger=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            larger=Math.max(larger, arr[i]);
        }

        int count[]=new int[larger+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=0; i<count.length; i++){
            while (count[i]>0) {
                arr[j]=i;
                j++;
                count[i]--;
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
        int arr[]={5,4,3,2,1};
        countSort(arr);
        pArray(arr);

    }
}
