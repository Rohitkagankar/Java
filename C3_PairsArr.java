public class C3_PairsArr {

    public static void pairs(int array[],int count){
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                System.out.print("("+array[i]+","+array[j]+")");
                count++;
            }
        }
        System.out.println();
        System.out.println("Total no of pairs : "+count);

    }
    public static void main(String[] args) {
        int array[]={2,4,6,8,10};
        int count=0;
        pairs(array,count);
        // System.out.println(count);

    }
}
