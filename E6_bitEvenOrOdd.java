public class E6_bitEvenOrOdd {
    public static void evenOdd(int n){
        int bit=1;
        if((n & bit)==1){
            System.out.println("Number is odd");
        }else{
            System.out.println("Number is even.");
        }
    }
    //get bit at i-th position----
    public static int getIthBit(int num,int i){
        int bit=1<<i;
        if((num & bit)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        // int n=5;
        evenOdd(4);
        System.out.println(getIthBit(10, 3));
    }
}
