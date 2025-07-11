public class PwNQueen {
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        //Filling the board with X
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = 'X';
            }
        }
        nqueens(board, 0);
    }
    public static void nqueens(char[][] board, int rows){
        int n = board.length;
        if(rows==n){
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int j=0; j<n; j++){
            if(isSafe(board,rows,j)){
                board[rows][j] = 'Q';   //koi aur queen nehi kaat rahi to place kar do Queen ko
                nqueens(board, rows+1); //RECURSION rows ko +1 karke
                board[rows][j] = 'X';   //BACKTRACKING
            }
        }
    }
        public static boolean isSafe(char[][] board, int rows, int col){
            int n = board.length;
            //check row
            for(int j=0; j<n; j++){
                if(board[rows][j] == 'Q') return false;
            }
            //check col
            for(int i=0; i<n; i++){
                if(board[i][col] == 'Q') return false; 
            }
            //north east
            int i = rows;
            int j = col;
            while(i>=0 && j<n){
                if(board[i][j]=='Q') return false;
                i--;
                j++;
            }
            //south east
            i = rows;
            j = col;
            while(i<n && j<n){
                if(board[i][j] == 'Q') return false;
                i++;
                j++;
            }
            //south west
            i = rows;
            j = col;
            while(i<n && j>=0){
                if(board[i][j] == 'Q') return false;
                i++;
                j--;
            }
            //north west
            i=rows;
            j = col;
            while(i>=0 && j>=0){
                if(board[i][j] == 'Q') return false;
                i--;
                j--;
            }
        
        return true;
    }
}
