public class F3_hybridInheritance {
    public static void main(String[] args) {
        Book b1=new Book();
        b1.lName();
        b1.sName();
        b1.bName();
        Publisher p1=new Publisher();
        p1.cName();
    }
}
//combination of all--------
class Library{
    void lName(){
        System.out.println("jscoe");
    }
}
class Publisher extends Library{
    void cName(){
        System.out.println("rk publishing.");
    }
}
class Student extends Library{
    void sName(){
        System.out.println("rohit");
    }
}
class Book extends Student{
    void bName(){
        System.out.println("chemistry");
    }
}
