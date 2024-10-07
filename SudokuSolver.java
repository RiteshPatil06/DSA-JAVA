/**
 * SudokuSolver
 */
public class SudokuSolver {

    //copilot    
    public static void main(String[] args) {
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        if(sudokuSolver(board)){//if solution exists
            printBoard(board);//print the board
        }
        else{
            System.out.println("Solution does not exist");//if solution does not exist
        }
    }

    public static boolean sudokuSolver(int[][] board){//sudoku solver
        int row = -1;//initialize row and column
        int col = -1;
        boolean isEmpty = true;//initialize isEmpty as true
        for(int i=0; i<board.length; i++){//for each row and column
            for(int j=0; j<board.length; j++){
                if(board[i][j] == 0){//if cell is empty
                    row = i;//update row
                    col = j;//update column
                    isEmpty = false;//update isEmpty as false
                    break;//break the loop
                }
            }
            if(!isEmpty){//if isEmpty is false
                break;//break the loop
            }
        }
        if(isEmpty){//if isEmpty is true
            return true;//return true
        }
        for(int num=1; num<=9; num++){//for each number from 1 to 9
            if(isSafe(board, row, col, num)){//if number can be placed
                board[row][col] = num;//place the number
                if(sudokuSolver(board)){//check for next cell
                    return true;//if solution exists
                }
                board[row][col] = 0;//backtrack
            }
        }
        return false;//return false
    }

    public static boolean isSafe(int[][] board, int row, int col, int num){//check if number can be placed
        for(int i=0; i<board.length; i++){//check if number is already placed in the same row or column
            if(board[row][i] == num || board[i][col] == num){
                return false;
            }
        }
        int sqrt = (int) Math.sqrt(board.length);//find the square root of the board size
        int rowStart = row - row % sqrt;//find the starting row of the subgrid
        int colStart = col - col % sqrt;//find the starting column of the subgrid
        for(int i=rowStart; i<rowStart+sqrt; i++){//check if number is already placed in the subgrid
            for(int j=colStart; j<colStart+sqrt; j++){//check if number is already placed in the subgrid
                if(board[i][j] == num){
                    return false;
                }
            }
        }
        return true;
    }

    public static void printBoard(int[][] board){//print the board
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    ///////////////////////////////////////////////////////////////////////

    //leetcode
    // public boolean isSafe(char[][] board, int row, int col, int num){
    //     //column
    //     for(int i=0; i<board.length; i++){
    //         if(board[i][col] == (char)(num + '0')){
    //             return false;
    //         }
    //     }

    //     //row
    //     for(int i=0; i<board.length; i++){
    //         if(board[row][i] == (char)(num + '0')){
    //             return false;
    //         }
    //     }

    //     //subgrid
    //     int sr = 3 * (row / 3);
    //     int sc = 3 * (col / 3);

    //     for(int i=0; i<sr+3; i++){
    //         for(int j=sc; j<sc+3; j++){
    //             if(board[i][j] == (char)(num + '0')){
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
    // }

    // public boolean helper(char[][] board, int row, int col){
    //     if(row == board.length) {
    //         return true;
    //     }

    //     int nrow = 0;
    //     int ncol = 0;
        
    //     if(col == board.length-1){
    //         nrow = row + 1;
    //         ncol = 0;
    //     }else {
    //         nrow = row;
    //         ncol = col + 1;
    //     }

    //     if(board[row][col] != '.'){
    //         if(helper(board, nrow, ncol)){
    //             return true;
    //         }
    //     }else{
    //         //fill the place
    //         for(int i=0; i<=9; i++){
    //             if(isSafe(board,row, col, i)){
    //                 board[row][col] = (char)(i+'0');
    //                 if(helper(board, nrow, ncol))
    //                     return true;
    //                 else
    //                     board[row][col] = '.';
    //             }
    //         }
    //     }

    //     return false;
    // }

    // public void solveSudoku(char[][] board) {
    //     helper(board, 0, 0);
    // }
}
