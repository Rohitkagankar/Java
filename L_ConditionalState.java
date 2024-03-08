import java.util.Scanner;

public class L_ConditionalState {
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
        else{
            System.out.println("b is greater than a");
        }
    }
}
