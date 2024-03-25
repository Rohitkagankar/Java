public class F9_supper {
    public static void main(String[] args) {
        Horse h=new Horse();
        System.out.println(h.color);
        Animal a1=new Animal();
        a1.color="red";
        System.out.println(a1.color);
    }
}
class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is called.");
    }
}
class Horse extends Animal{
    Horse(){
        super.color="brown";
        System.out.println("Horse constructor is called.");
    }
}