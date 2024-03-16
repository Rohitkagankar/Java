import java.util.Scanner;

public class Z3_2dArray {

    public static boolean searchEle(int matrix[][],int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==key){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][3];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j]=sc.nextInt();
            }
            // System.out.println();
        }
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println(searchEle(matrix, 6));
    }
}
