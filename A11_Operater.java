public class A11_Operater {
    public static void main(String[] args) {
        int a= 20;
        int b =3;
        System.out.println("add = "+(a+b));
        System.out.println("sub = "+(a-b));
        System.out.println("mul = "+(a*b));
        System.out.println("div = "+(a/b));
        System.out.println("modulo = "+(a%b));
        int d=10;
        int e=++d;
        int f = d++;
        System.out.println(d);
        System.out.println(!(d==10));
        System.out.println(e);
        System.out.println(f);
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        //logical operators
        if(a>10 && b<10){
            System.out.println("ok");
            if(a==20 || b==5){
                System.out.println("hello");
                if(a!=30){
                    System.out.println("false");
                }
            }
        }
    }
}
