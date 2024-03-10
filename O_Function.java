public class O_Function {
    public static void printHello(){
        System.out.println("hello world.");
        System.out.println("hello world.");
        System.out.println("hello world.");
        System.out.println("hello world.");
    }
    public static int sum(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static int sum(int a ,int b,int c){
        int sum=a+b+c;
        return sum;
    }
    public static int product(int a,int b){
        int prod=a*b;
        return prod;
    }
    public static int factorial(int n){
        int f=1;
        for(int i=1; i<=n; i++){
            f=f*i;
        }
        return f;
    }
    public static int bionomial(int n,int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int nmr_fact=factorial(n-r);
        int bioCoff=n_fact/(r_fact*nmr_fact);
        return bioCoff;
    }
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        printHello();
        int sums=sum(5, 10);
        System.out.println(sums);
        System.out.println(sum(3,4,5));
        int prod=product(4,5);
        System.out.println(prod);
        int fact=factorial(5);
        System.out.println("factorial is "+fact);
        System.out.println(bionomial(5,2));
        System.out.println(isPrime(5));
    }
}
