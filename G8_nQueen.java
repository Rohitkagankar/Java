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
    public static void printBoard(char board[][]){
        System.out.println("---------chess board--------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
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
    }
}
