public class G8_nQueen {
    public static boolean isSafe(char board[][],int row,int col){
        //vertical up
        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //left diagonal
        for(int i=row-1 ,j=col-1; i>=0 && j>=0; i-- ,j--){
            if(board[i][j]=='Q'){
                return false;
            
            }
        }
        //right diagonal
        for(int i=row-1, j=col+1; i>=0 && j<board.length ; i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQueen(char board[][],int row){
        //base
        if(row==board.length){
            printBoard(board);
            count++;
            return;
        }
        //recorsion
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j]='Q';
                nQueen(board, row+1); //function call
                board[row][j]='x';  
            }
            
        }
    }
    public static boolean nQueens(char board[][],int row){
        //base
        if(row==board.length){
            printBoard(board);
            
            return true;
        }
        //recorsion
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j]='Q';
                if(nQueens(board, row+1)){
                    return true;
                } //function call
                board[row][j]='x';  
            }
            
        }
        return false;
    }
    public static void printBoard(char board[][]){
        System.out.println("---------chess board--------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int count=0;
    public static void main(String[] args) {
        int n=4;
        char board [][]=new char[n][n];
        //initialize
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                board[i][j]='x';
            }
        }
        nQueen(board, 0);
        System.out.println("the number of ways are = "+ count);
        if(nQueens(board, 0)){
            System.out.println("Solution is possible");
            printBoard(board);
        }else{
            System.out.println("Solution is not possible");
        }
    }
}
