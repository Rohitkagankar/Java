public class E7_oops1 {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColor("Red");
        System.out.println(p1.color);
        p1.Pointer=5;
        System.out.println(p1.Pointer);

        Student s1=new Student();
        s1.name="rohit";
        System.out.println(s1.name);
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
    String name;
    int rollno;
    float cgpa;
    void setName(String sname){
        name=sname;
    }
}
