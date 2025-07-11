public class maxK_Knights {
    static int maxKnights = -1;
    static int number = 3;
    public static boolean isSafe(char[][] board,int row, int col){
        int n = board.length;
        int i,j;
        //2up 1 Right
        i=row-2;
        j=col+1;
        if(i>=0 && j<n && board[i][j]=='K') return false;
        //2 up 1 left
        i=row-2;
        j=col-1;
        if(i>=0 && j>=0 && board[i][j]=='K') return false;
        //2 down 1 right
        i=row+2;
        j=col+1;
        if(i<n && j<n && board[i][j]=='K') return false;
        //2 down 1 left
        i=row+2;
        j=col-1;
        if(i<n && j>=0 && board[i][j]=='K') return false;
        //2 left 1 up
        i=row-1;
        j=col-2;
        if(i>=0 && j>=0 && board[i][j]=='K') return false;
        //2 left 1 down
        i=row+1;
        j=col-2;
        if(i<n && j>=0 && board[i][j]=='K') return false;
        //2 right 1 up
        i=row-1;
        j=col+2;
        if(i>=0 && j<n && board[i][j]=='K') return false;
        //2 right 1 down
        i=row+1;
        j=col+2;
        if(i<n && j<n && board[i][j]=='K') return false;
        return true;
    }
    public static void nKnight(char[][] board, int row, int col, int num){
        int n = board.length;
        if(row==n){                 //BASE CASE --> AGAR ROWS KHATAM TO PRINT KR DO.
            // if(num==number){
            //     for(int i=0; i<n; i++){
            //         for(int j=0; j<n; j++){
            //             System.out.print(board[i][j]);
            //         }
            //         System.out.println();
            //     }
            //     System.out.println();
            // }
            maxKnights = Math.max(maxKnights,num);
            return;
            }
        else if(isSafe(board, row, col)){
            board[row][col] = 'K';
            if(col<n-1) nKnight(board, row, col+1, num+1);  //SAFE HAI TO K PUT KARO AUR NUM + 1.
            else nKnight(board, row+1, 0, num+1);   //LAST COL PE AAGAYE TO NEXT ROW JANA HAIN AUR COL KO 0 SET KRNA HAIN.
            board[row][col] = '.';  //BACKTRACKING
        }
        if(col!=n-1) nKnight(board, row, col+1, num);
        else nKnight(board, row+1, 0, num);
        
    }
   public static void main(String[] args) {
    int n = 3;
    char[][] board = new char[n][n];
    for(int i=0; i<n; i++){
        for(int j=1; j<n; j++){
            board[i][j] = '.';
        }
    }
    nKnight(board, 0, 0, 0);
    System.out.println(maxKnights);
   } 
}
