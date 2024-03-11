/**
 * Q_AdvPattern
 */
public class Q_AdvPattern {

    public static void hollow_pattern(int row , int col){
        for(int i=1; i<=row; i++){
            //outer loop
            for(int j=1; j<=col; j++){
                //inner loop
                if(i==1||i==row||j==1||j==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void reverse_half_pyramid(int n){
        for(int i=1; i<=n; i++){
            //for outer loop
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_pattern(4,5);
        reverse_half_pyramid(5);
    }
}