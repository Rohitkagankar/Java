public class E6_bitEvenOrOdd {
    public static void evenOdd(int n){
        int bit=1;
        if((n & bit)==1){
            System.out.println("Number is odd");
        }else{
            System.out.println("Number is even.");
        }
    }
    public static void main(String[] args) {
        // int n=5;
        evenOdd(4);
    }
}
