public class sudokuSolver {
    // static int check = 0;
    public static boolean isValid(char[][] board, int row, int col,char num){
        //check row
        for(int j=0; j<9; j++){
            if(board[row][j] == num) return false;
        }
        //check col
        for(int i=0;i<9;i++){
            if(board[i][col]==num) return false;
        }
        //check box 3*3
        int sRow = (row/3)*3;
        int sCol = (col/3)*3;
        for(int i=sRow; i<sRow+3; i++){
            for(int j=sCol; j<sCol+3; j++){
                if(board[i][j] == num) return false;
            }
        }

        return true;
    }
    public static void solve(char[][] board, int row, int col,char[][] grid){
        if(row==9){
            // check = 1;
            for(int i=0; i<9; i++){
                for(int j=0; j<9; j++){
                    grid[i][j] = board[i][j];
                }
            }
            return;
        }
        else if(board[row][col]!='.') {
            if(col!=8) solve(board, row, col+1,grid);
            else solve(board, row+1, 0,grid);
        }
        else{
            for(char ch='1'; ch<'9'; ch++){
                if(isValid(board,row,col,ch)){
                    board[row][col] = ch;
                    if(col!=8) solve(board, row, col+1,grid);
                    else solve(board, row+1, 0,grid);
                    // if(check == 1) return;
                    board[row][col] = '.';  //backtracking
                }
            }
        }
    }
    public static void solveSudoku(char[][] board){
        char[][] grid = new char[9][9];
        solve(board,0,0,grid);
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                    board[i][j] = grid[i][j];
                }
            }
        }
    public static void main(String[] args){
        char[][] board = new char[9][9];
        solveSudoku(board);
        // check = 0;

    }
}
