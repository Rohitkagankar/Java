public class E7_oops1 {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColor("Red");
        System.out.println(p1.color);
        p1.Pointer=5;
        System.out.println(p1.Pointer);

        //getter and setters-----
        Student s1=new Student();
        s1.setName("rohit");
        System.out.println(s1.getName());
        s1.setRollno(3266);
        System.out.println(s1.getRollno());

        BankDetails b1=new BankDetails();
        b1.name="BOI";
        // b1.password="asdf";  not allow 
        b1.setPassword("abcd");
        System.out.println(b1.name);
        
    }
}
class BankDetails{
    public String name;
    @SuppressWarnings("unused")
    private String password;
    public void setPassword(String password) {
        this.password=password;
    }
}

class Pen{
    String color;
    int Pointer;
    void setColor(String newcolor){
        color=newcolor;
    }
    void setPointer(int newPointer){
        Pointer=newPointer;
    }
}
class Student{
    private String name;
    private int rollno;
    float cgpa;
    
    String getName(){
        return this.name;
    }
    int getRollno(){
        return this.rollno;
    }
    void setName(String name) {
        this.name = name;
    }
    void setRollno(int rollno) {
        this.rollno = rollno;
    }

}
