import java.util.Scanner;

public class A13_Loops {
    public static void main(String[] args) {
    int count=0;
    while(count<10){
        System.out.println("hello world "+ (count+1));
        count++;
    }

    //print nos from 1 to 10
    int counter = 1;
    while (counter <=10) {
        System.out.println("counter: "+ counter);
        counter++;
        
    }

    System.out.println("Enter a number: ");
    Scanner sc = new Scanner(System.in);
    int num =sc.nextInt();
    counter= 1;
    int sum=0;
    while (counter<=num) {
        System.out.println(counter);
        sum=sum+counter;
        counter++;  
    }
    System.out.println("sum is : "+ sum);

    //for loop Start------
    for(int i=0; i<=10; i++){
        System.out.println("Helo world");
    }
    
    for (int line=1; line<=4; line++){
        System.out.println("****");
        
    }
    //reverse a number
    int num1=12345;
    while (num1>0) {
        int lastnum=num1%10;
        System.out.print(lastnum);
        num1=num1/10;  
    }
    System.out.println(" ");
    int rev=0;
    int n1=12345;
    while (n1>0) {
        int last=n1%10;
        rev=(rev*10)+last;
        n1=n1/10;  
    }
    System.out.println(rev);

    //do while loop
    int c=1;
    do{
        System.out.println("hello world");
        c++;
    }while(c<=10);

    //break statement
    for(int i=1; i<10; i++){
        if(i==5){
            break;
        }
        System.out.println(i);
    }

    //num multiple of 10 then exit the loop
    System.out.println("enter the num: ");
    do{
        int n2=sc.nextInt();
        if(n2 % 10 ==0){
            break;
        }
        System.out.println(n2);
    }while (true);

    //continue
    for (int i=1; i<=5; i++){
        if(i==2){
            continue;
        }
        System.out.println(i);
    }


    int n=sc.nextInt();
    if(n==2){
        System.out.println("the number is prime.");
    }else{
        boolean isprime=true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if (n%i==0) {
                isprime=false;
            }
        }
        if(isprime==true){
            System.out.println("the number is prime.");
        }else{
            System.out.println("the number is not prime.");
        }
    }

    }
}
