public class F6_abstraction {
    public static void main(String[] args) {
        Child c1=new Child();
        c1.city();
        c1.mark();
        c1.name();
    }
}
abstract class Boy{
    abstract void name();
    abstract void mark();
    void city(){
        System.out.println("kolhapur");
    }
}
class Child extends Boy{
    void name(){
        System.out.println("rohit");
    }
    void mark(){
        System.out.println(92);
    }
}
