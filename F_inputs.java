import java.util.Scanner;

public class F_inputs {
    public static void main(String[] args) {
        Scanner a =new Scanner(System.in);

        String input = a.next();
        System.out.println(input);

        String name = a.nextLine();
        System.out.println(name);

        int number = a.nextInt();
        System.out.println(number);
        //nextFloat,nextBoolean,nextDouble,nextLong,nextShort,nextByte similarly
    }
}
