public class G8_nQueen {
    public static void nQueen(char board[][],int row){
        //base
        if(row==board.length){
            printBoard(board);
            return;
        }
        //recorsion
        for(int j=0; j<board.length; j++){
            board[row][j]='Q';
            nQueen(board, row+1); //function call
            board[row][j]='x';
        }
    }
    public static void printBoard(char board[][]){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=2;
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
