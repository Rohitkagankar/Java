public class G1_recursion {
    public static void recorReverse(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        recorReverse(n-1);
    }
    public static void main(String[] args) {
       int a=10;
       recorReverse(a);
    }
}

