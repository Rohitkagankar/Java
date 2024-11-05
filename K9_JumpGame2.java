public class K9_JumpGame2 {
    public static int jump(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        int n=nums.length;
        int currend=0;
        int farthest=0;
        int jump=0;
        for(int i=0; i<n-1; i++){
            farthest=Math.max(farthest,i+nums[i]);
            if(i==currend){
                jump++;
                currend=farthest;
            }
        }
        return jump;
    }
    public static void main(String[] args) {
        int [] nums = {2,3,1,1,4};
        System.out.println(jump(nums));
    }
}
