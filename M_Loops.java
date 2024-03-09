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

    }
}
