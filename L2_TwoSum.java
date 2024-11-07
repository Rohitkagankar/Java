public class L2_TwoSum {
    public static int [] twoSum(int [] nums, int target){
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                if(nums[i]+ nums[j]==target){
                    int arr[]={i,j};
                    return arr;
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;
        int [] result=twoSum(nums,target);
        System.out.print("[");
        for(int num : result){
            System.out.print(num+",");
        }
        System.out.print("]");
        System.out.println();
    }
}
