public class D3_spiralMatrix {
    public static void spiral(int matrix[][]){
        int startRow=0;
        int startColumn=0;
        int endRow=matrix.length-1;
        int endColumn=matrix[0].length-1;
        while(startRow<=endRow && startColumn<=endColumn){
            for(int j=startColumn; j<=endColumn; j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            for(int k=startRow+1; k<=endRow; k++){
                System.out.print(matrix[k][endColumn]+" ");
            }
            for(int l=endColumn-1; l>=startColumn; l--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][l]+" ");
            }
            for(int m=endRow-1; m>=startRow+1; m--){
                if(startColumn==endColumn){
                    break;
                }
                System.out.print(matrix[m][startColumn]+" ");
            }
            startColumn++;
            startRow++;
            endColumn--;
            endRow--;

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        spiral(matrix);

    }
}
