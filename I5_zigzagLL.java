public class I5_zigzagLL {
    public static void sum(int a,int b){
        System.out.println("sum is " + (a+b));
    }
    public static void sub(int a,int b){
        System.out.println("sum is " + (a-b));
    }
    public static void mul(int a,int b){
        System.out.println("sum is " + (a*b));
    }
    public static void div(int a,int b){
        System.out.println("sum is " + (a/b));
    }
    public static void sqArea(int a, int b){
        System.out.println(a*b);
    }
    public static void sqare(int a, int b){
        System.out.println(a*b);
    }
    public static void sqareRoot(int a){
        System.out.println(a*0.5);
    }

    public static void main(String[] args) {
        System.out.println("hello world");
        sum(10,20);
        sub(10,20);
        mul(10,20);
        div(20,10);
        sqArea(3,5);
        sqare(2,5);
        sqareRoot(0);
    }
}