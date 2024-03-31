public class F8_static {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Student s1=new Student();
        s1.schoolname="jspm";
        Student s2=new Student();
        System.out.println(s2.schoolname);
    }
}
class Student{
    String name;
    int roll;

    static int calPercentage(int phy,int math, int chem){
        return (phy+chem+math)/3;
    }

    static String schoolname;

    void setname( String name){
        this.name=name;
    }
    String getname(){
        return this.name;
    }
}