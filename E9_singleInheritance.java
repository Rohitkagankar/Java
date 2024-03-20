public class E9_singleInheritance {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("eats food.");
    }
    void breath(){
        System.out.println("breath like human.");
    }
}
class Dog extends Animal {
    void bark(){
        System.out.println("barking.");
    }
}