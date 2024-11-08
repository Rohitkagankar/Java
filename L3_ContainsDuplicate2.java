import java.util.HashMap;
import java.util.Map;

public class L3_ContainsDuplicate2 {
    public static boolean containsDuplicate(int [] nums, int k){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int prev=map.get(nums[i]);
                if(i-prev <= k){
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(containsDuplicate(nums, k));
    }
}
