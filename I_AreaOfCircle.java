import java.util.*;
public class I_AreaOfCircle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float rad = sc.nextFloat();
            float area = 3.14f * rad *rad;
            System.out.println(area);
        }
    }
}
