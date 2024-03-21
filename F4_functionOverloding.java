public class F4_functionOverloding {
    public static void main(String[] args) {
        calculator cal=new calculator();
        cal.sum(3, 4);
        cal.sum((float) 3.2, (float) 5.2);
        cal.sum(1, 2,3);
    }
}
//same function with different parameters------
class calculator{
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(float a,float b){
        System.out.println(a+b);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
