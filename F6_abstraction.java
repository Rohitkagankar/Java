public class F6_abstraction {
    public static void main(String[] args) {
        Child c1=new Child();
        c1.city();
        c1.mark();
        c1.name();
        c1.changeColor();
        System.out.println(c1.color);
       
    }
}
abstract class Boy{
    String color;
    Boy(){
        color="skin color";
    }
    abstract void name();
    abstract void mark();
    void city(){
        System.out.println("kolhapur");
    }
}
class Child extends Boy{
    void changeColor(){
        String color="black";
        System.out.println(color);
    }
    void name(){
        System.out.println("rohit");
    }
    void mark(){
        System.out.println(92);
    }
}
