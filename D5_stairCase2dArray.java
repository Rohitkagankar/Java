public class D5_stairCase2dArray {

    public static boolean stairs(int matrix[][],int key){
        int row=0; int col=matrix.length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.print("key is at ("+row+" "+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("key is not found.");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key=25;
        stairs(matrix,key);
        
        System.out.println();
    }
}
