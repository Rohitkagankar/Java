public class M9_Sqrt {
    public static int findSqrt(int x){
        int left=1;
        int right=x;
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(mid <= x/mid){
                ans=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int x=16;
        System.out.println(findSqrt(x));
    }
}
