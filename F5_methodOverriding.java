public class F5_methodOverriding {
    public static void main(String[] args) {
        Book b1=new Book();
        b1.bName();
        Library l1=new Library();
        l1.bName();
    }
}
class Library{
    void bName(){
        System.out.println("chemistry.");
    }
}
class Book extends Library{
    void bName(){
        System.out.println("physics.");
    }
}