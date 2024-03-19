public class E8_constructor {
    public static void main(String[] args) {


        Student s1=new Student();
        // System.out.println(s1.name);
        
    }
}

class Student{
    String name;
    int rollno;
    // Student(String name){
    //     this.name=name;
    // }
    Student(){
        System.out.println("Constructor is called...");
    }
    

}