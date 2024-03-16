import java.util.Scanner;

public class B3_ConditionalState {
    public static void main(String[] args) {
        // int age=19;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age.");
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("you can vote...");
        }
        else{
            System.out.println("you can not vote");
        }

        //largest amont two nos
        int a=5;
        int b=6;
        if(a<b){
            System.out.println("a is greater than b");
        }
        else if(a==b){
            System.out.println("a and b are equal.");
        }
        else{
            System.out.println("b is greater than a");
        }
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("ODD");
        }

        //income tax calculation
        System.out.println("Enter your Sallery.");
        int income=sc.nextInt();
        float tax;
        if(income< 500000){
            tax=0;
        }
        else if(income>500000 && income<1000000){
            tax=(int)(income *0.2);
        }
        else{
            tax=(int)(income *0.3);
        }
        System.out.println("your tax is: "+tax);

        //largest among three numbers

        int x=10,y=20,z=30;
        if(x>=y && x>=z){
            System.out.println("the largest is = "+x );
        }
        else if(y>=z){
            System.out.println("the largest is = "+y );
        }
        else{
            System.out.println("the largest is = "+z );
        }

        //ternary operator
        int larger=y>x? y:x;
        System.out.println(larger);
        String check=x%2==0? "Even":"Odd";
        System.out.println(check);

        int mark=50;
        String status=mark>=33? "Pass":"Fail";
        System.out.println(status);

        //switch case
        int nums=2;
        switch (nums) {
            case 1:
            System.out.println("Case 1 ");
                break;
            case 2:
            System.out.println("Case 2 ");
                break;
            case 3:
            System.out.println("Case 3 ");
                break;
            default:
            System.out.println(" Non Case is true. ");
                
                
        }
        //calculator
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int num1=s.nextInt();
        System.out.println("Enter second Number: ");
        int num2=s.nextInt();
        System.out.println("Enter operator: ");
        Character operator=s.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("Sum is : "+(num1+num2));
                break;
            case '-':
                System.out.println("Sum is : "+(num1-num2));
                break;
            case '*':
                System.out.println("Sum is : "+(num1*num2));
                break;
            case '/':
                System.out.println("Sum is : "+(num1/num2));
                break;
            case '%':
                System.out.println("Sum is : "+(num1%num2));
                break;
            default:
                System.out.println("you choose wrong.");
                break;
        }
    }
}
