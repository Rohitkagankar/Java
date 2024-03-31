public class E8_constructor {
    public static void main(String[] args) {


        Student s1=new Student();
        @SuppressWarnings("unused")
        Student s2=new Student("rohit");
        @SuppressWarnings("unused")
        Student s3=new Student(123);

        s1.name="ranjit";
        s1.rollno=123;
        s1.password="abcd";
        
        s1.marks[0]=100;
        s1.marks[1]=90;
        Student s5=new Student(s1);
        s5.password="pqrs";
        System.out.println(s5.name);
        System.out.println(s5.rollno);
        System.out.println(s5.password);
        s1.marks[2]=80;
        
        for(int i=0; i<s1.marks.length; i++){
            System.out.println(s1.marks[i]);
        }
        for(int i=0; i<s5.marks.length; i++){
            System.out.println(s5.marks[i]);
        }
    }
}

class Student{
    String name;
    int rollno;
    String password;
    int marks[];

    //shallo copy constructor
    // Student(Student s1){
    //     marks=new int[3];
    //     this.name=s1.name;
    //     this.rollno=s1.rollno;
    //     this.marks=s1.marks;
    // }

    
    //deep copy constructor
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.rollno=s1.rollno;
        for(int i=0; i<marks.length; i++){
            this.marks[i]=s1.marks[i];
        }

    }
    Student(){
        System.out.println("Constructor is called...");
        marks=new int[3];
    }
    Student(String name){
        this.name=name;
        marks=new int[3];
    }
    Student(int rollno){
        this.rollno=rollno;
        marks=new int[3];
    }
    

}