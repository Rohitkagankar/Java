public class F7_interfaces {
    public static void main(String[] args) {
        Elefant e=new Elefant();
        e.direction();

        Bear b1=new Bear();
        b1.eat();
        b1.eats();
    }
}
interface Move{
    public void direction();
}
class Queen implements Move{
    public void direction(){
        System.out.println("up,down,left,right,digonal");
    }
}
class Elefant implements Move{
    public void direction(){
        System.out.println("up,down,left,right");
    }
}

//multiple inheritance----
interface Veg{
    void eat();
}
interface Nonveg{
    void eats();
}
class Bear implements Veg,Nonveg{
    public void eat(){
        System.out.println("veg");
    }
    public void eats(){
        System.out.println("nonveg");
    }
}