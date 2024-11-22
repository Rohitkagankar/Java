public class M7_SearchAndFind {
    public static int findPosition(int [] arr,int target){
        if(arr==null && arr.length==0){
            return -1;
        }
        int left=0;
        int right=arr.length-1;
        while(left <= right){
            int mid=left+(right-left)/2;
            if(target==arr[mid]){
                return mid;
            }else if(arr[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int [] nums={1,2,5,6};
        int target=5;
        System.out.println(findPosition(nums,target));
    }
}
