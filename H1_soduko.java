public class H1_soduko {
    public static boolean isSafe(int arr[][], int row, int col, int digit) {
        // col
        for (int i = 0; i < 9; i++) {
            if (arr[row][i] == digit) {
                return false;
            }
        }

        // row
        for (int i = 0; i < 9; i++) {
            if (arr[i][col] == digit) {
                return false;
            }
        }

        // grid
        int stRow = (row / 3) * 3;
        int stCol = (col / 3) * 3;
        for (int i = stRow; i < stRow + 3; i++) {
            for (int j = stCol; j < stCol + 3; j++) {
                if (arr[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sodukoSolver(int arr[][], int row, int col) {
        // base
        if (row == 9) {
            return true;
        }

        int nextRow = row;
        int nextCol = col + 1;
        if (nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }
        // recursion
        if (arr[row][col] != 0) {
            sodukoSolver(arr, nextRow, nextCol);
        }
        for (int digit = 0; digit <= 9; digit++) {
            if (isSafe(arr, row, col, digit)) {
                arr[row][col] = digit;
                if(sodukoSolver(arr, nextRow, nextCol)){
                    return true;
                }
                arr[row][col]=0;
            }
        }
        return false;
    }

    // print arr----
    public static void printArr(int arr[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 }
        };
        if(sodukoSolver(arr, 0, 0)){
            System.out.println("solution exist.");
            printArr(arr);
        }else{
            System.out.println("solution does not exist.");
        }

    }
}
