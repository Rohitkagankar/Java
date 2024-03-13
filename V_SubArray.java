/**
 * V_SubArray
 */
public class V_SubArray {
    public static void subArray(int array[]){
        int total=0;
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i<array.length; i++){
            //i
            for(int j=i; j<array.length; j++){
                //j
                sum=0;
                for(int k=i; k<=j; k++){
                    System.out.print(array[k]+" ");
                    sum=sum+array[k]; 
                }
                if(maxSum<sum){
                    maxSum=sum;
                }
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total pairs are : "+total);
        System.out.println("max pair sum is : "+maxSum);
    }

    //using prefix sum 
    public static void PresubArray(int array[]){
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        int prefix[]=new int[array.length];

        prefix[0]=array[0];
        for(int i=1; i<array.length; i++){
            prefix[i]=prefix[i-1]+array[i];
        }

        for(int i=0; i<array.length; i++){
            //i
            for(int j=i; j<array.length; j++){
                sum= i==0? prefix[j] : prefix[j]-prefix[i-1];
                if(maxSum<sum){
                    maxSum=sum;
                }
               
            }
            
        }
        System.out.println("max pair sum is : "+maxSum);
    }


    public static void main(String[] args) {
        int array[]={2,4,6,8,10};
        subArray(array);
        int arr[]={1,2,3,4,5};
        PresubArray(arr);
    }
}