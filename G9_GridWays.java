public class G9_GridWays {
    public static int gridWays(int i, int j, int row,int col){
        if(i==row-1 && j==col-1){
            return 1;
        }else if (i==row || j==row){
            return 0;
        }

        int g1=gridWays(i+1, j, row, col);
        int g2=gridWays(i, j+1, row, col);
        return g1+g2;
    }
    public static void main(String[] args) {
        int row=3;
        int col=3;
        System.out.println(gridWays(0, 0, row, col));
    }
}
