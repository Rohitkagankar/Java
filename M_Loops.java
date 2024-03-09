import java.util.Scanner;

public class M_Loops {
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
    }
}
