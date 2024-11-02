public class K6_Trapping_water {
    public static int trap(int[] height) {
        int n=height.length;
        //find leftmost array
        int i=1;
        int [] leftmost=new int[n];
        leftmost[0]=height[0];
        while(i<n){
            leftmost[i]=Math.max(height[i],leftmost[i-1]);
            i++;
        }
        //find rightmost array
        int rightmost []=new int[n];
        rightmost[n-1]=height[n-1];
        int k=n-2;
        while(k>=0){
            rightmost[k]=Math.max(height[k],rightmost[k+1]);
            k--;
        }
        //find trapped water
        int trWater=0;
        int l=0;
        while(l<n){
            int water=Math.min(leftmost[l],rightmost[l]);
            trWater+=water-height[l];
            l++;
        }
        return trWater;
    }
    public static void main(String[] args) {
        int [] height={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
