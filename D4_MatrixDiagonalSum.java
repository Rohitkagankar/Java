public class D4_MatrixDiagonalSum {
    //first solution--------
    public static void digonalSum(int matrix[][]){
        int sum=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(i==j){
                    sum=sum+matrix[i][j];
                }else if ((i+j)==(matrix.length-1)){
                    sum+=matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    //second solution-------
    public static void diaSum(int matrix[][]){
        int sum=0;
        for(int i=0; i<matrix.length; i++){
            sum=sum+matrix[i][i];
            if(i !=matrix.length-i-1){
                sum=sum+matrix[i][matrix.length-i-1];
            }
        }
        System.out.println(sum);
    }

    //main ----------
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        digonalSum(matrix);
        diaSum(matrix);
    }
}
