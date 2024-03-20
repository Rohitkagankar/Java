public class F2_HierarchialInheritance {
   public static void main(String[] args) {
    Dog d1=new Dog();
    d1.eat();
   }
}
class Animal{
    void eat(){
        System.out.println("eat");
    }
    void breath(){
        System.out.println("breath");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("bark");
    }
}
class bird extends Animal{
    void fly(){
        System.out.println("flying.");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}