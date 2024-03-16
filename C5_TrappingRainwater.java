
public class C5_TrappingRainwater {
    public static void trapwater(int height[]){
        //calculate leftmax boundry array
        int n=height.length;
        int leftmost[]=new int [n];
        leftmost[0]=height[0];
        int i=1;
        while(i<n){
            leftmost[i]=Math.max(height[i], leftmost[i-1]);
            i++;
        }
        //using for loop
        // for(int x=1; x<n; x++){
        //     leftmost[x]=Math.max(height[x], leftmost[x-1]);
            
        // }

        // for(int j=0; j<leftmost.length; j++){
        //     System.out.print(leftmost[j]+" ");
        // }
        // System.out.println();

        //calculate rightmax boundry array
        int rightmost[]=new int [height.length];
        rightmost[n-1]=height[n-1];
        int k=n-2;
        while(k>=0){
            rightmost[k]=Math.max(height[k], rightmost[k+1]);
            k--;
        }
        //using for loop
        // for(int x=n-2; x>=0; x--){
        //     rightmost[x]=Math.max(height[x], rightmost[x+1]);
            
        // }

        // for(int j=0; j<rightmost.length; j++){
        //     System.out.print(rightmost[j]+" ");
        // }
        // System.out.println();

        //loop
        int l=0;
        int trWater=0;
        while(l<n){
            int water=Math.min(leftmost[l], rightmost[l]);
            trWater+=water-height[l];
            l++;
        }
        System.out.println("trapped water is "+trWater);
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        trapwater(height);

    }
}
