public class F1_multiLevelInheritance {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.cName();
        e1.location();
    }
}
class Company{
    void cName(){
        System.out.println("Amazon");
    }
    void location(){
        System.out.println("Pune");
    }
}
class Department extends Company{
    void Dname(){
        System.out.println("developer");
    }
}
class Employee extends Department{
    void eName(){
        System.out.println("Rohit");
    }
}
