
/**
 * Backtracking1: N-Queens Problem
 * NxN chessboard, place N queens such that queens are safe
 * 
 */
// public class Backtracking1 {

//     public static void main(String[] args) {
//         int n = 4;
//         int[][] board = new int[n][n];
//         if(nQueens(board, 0, n)){//0 is the column
//             printBoard(board);//print the board
//         }
//         else{
//             System.out.println("Solution does not exist");//if solution does not exist
//         }
//     }

//     public static boolean nQueens(int[][] board, int col, int n){//col is the column, n is the size of the board
//         if(col == n){//if all queens are placed
//             return true;//return true
//         }
//         for(int i=0; i<n; i++){//for each row
//             if(isSafe(board, i, col, n)){//if queen can be placed
//                 board[i][col] = 1;//place the queen
//                 if(nQueens(board, col+1, n)){//check for next column
//                     return true;//if solution exists
//                 }
//                 board[i][col] = 0;//backtrack
//             }
//         }
//         return false;
//     }

//     public static boolean isSafe(int[][] board, int row, int col, int n){
//         for(int i=0; i<col; i++){//check if queen is already placed in the same column
//             if(board[row][i] == 1){//if queen is already placed in the same row
//                 return false;
//             }
//         }
//         for(int i=row, j=col; i>=0 && j>=0; i--, j--){//check if queen is already placed in the left diagonal
//             if(board[i][j] == 1){//if queen is already placed in the left diagonal
//                 return false;
//             }
//         }
//         for(int i=row, j=col; i<n && j>=0; i++, j--){//check if queen is already placed in the right diagonal
//             if(board[i][j] == 1){  //check if queen is already placed in the right diagonal
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void printBoard(int[][] board){
//         for(int i=0; i<board.length; i++){
//             for(int j=0; j<board.length; j++){
//                 System.out.print(board[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     // output: 0 0 1 0 
//             // 1 0 0 0 
//             // 0 0 0 1 
//             // 0 1 0 0 
    
//  }

 ///////////////////////////////////////////////////////////////////////////
import java.util.ArrayList;
import java.util.List;

public class Backtracking1 {
    public static void main(String[] args) {
        int n = 4; // Example input
        List<List<String>> solutions = solveNQueens(n);//solve N-Queens problem
        for (List<String> solution : solutions) {//for each solution
            for (String row : solution) {//for each row
                System.out.println(row);//print the row
            }
            System.out.println();
        }
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();//initialize solutions
        char[][] board = new char[n][n];//initialize board
        for (int i = 0; i < n; i++) {//for each row and column
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        solve(solutions, board, 0, n);
        return solutions;
    }

    private static void solve(List<List<String>> solutions, char[][] board, int row, int n) {
        if (row == n) {
            solutions.add(construct(board));
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isValid(board, row, col, n)) {
                board[row][col] = 'Q';
                solve(solutions, board, row + 1, n);
                board[row][col] = '.';
            }
        }
    }

    private static boolean isValid(char[][] board, int row, int col, int n) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    private static List<String> construct(char[][] board) {
        List<String> path = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            path.add(new String(board[i]));
        }
        return path;
    }
}

