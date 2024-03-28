public class G4_BinaryDivideConquare {
    public static int divideCon(int arr[],int tar,int si,int ei){
        if(si>ei){
            return -1;
        }
        //mid
        int mid=si+(ei-si)/2;
        if(arr[mid]==tar){
            return mid;
        }
        //for line 1;
        if(arr[si]<=arr[mid]){
            if(arr[si]<=tar && tar<=arr[mid]){
                return divideCon(arr, tar, si, mid-1);
            }else{
                return divideCon(arr, tar, mid+1, ei);
            }
        }
        //for line 2
        else{
            if(arr[mid]<=tar && tar<=arr[ei]){
                return divideCon(arr, tar, mid+1, ei);
            }else{
                return divideCon(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2,3};
        int tar=0;
        int tarIdx=divideCon(arr, tar, 0, arr.length-1);
        System.out.println(tarIdx);

    }
}
