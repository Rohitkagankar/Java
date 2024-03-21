public class F6_abstraction {
    public static void main(String[] args) {
        Child c1=new Child();
        //boy-->child--constructor is called.
        c1.city();
        c1.mark();
        c1.name();
        c1.changeColor();
        System.out.println(c1.color);
       
    }
}
abstract class Boy{
    String color="skin color";
    //constructor
    // Boy(){
    //     color="skin color";
    // }
    Boy(){
        System.out.println("boy constructor is called.");
    }
    abstract void name();
    abstract void mark();
    void city(){
        System.out.println("kolhapur");
    }
}
class Child extends Boy{
    Child(){
        System.out.println("boy constructor is called.");
    }
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
