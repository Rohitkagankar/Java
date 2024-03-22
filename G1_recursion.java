public class G1_recursion {

    //print 1 to n numbers in reverse order-----
    public static void recorReverse(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        recorReverse(n-1);
    }
    //print 1 to n numbers-----
    public static void recInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        recInc(n-1);
        System.out.print(n+" ");
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fa=n * fact(n-1);
        return fa;
    }
    public static void main(String[] args) {
       //print 1 to n numbers in reverse order-----
       int a=10;
       recorReverse(a);
       System.out.println();

       //print 1 to n numbers-----
       int b=15;
       recInc(b);

       System.out.println();
       //print factorial of given number-----
       int n=5;
       System.out.println(fact(n));
    }
}

