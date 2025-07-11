public class knightTour {
    public static void main(String[] args){
        int [][] gird = {{0,3,6},{5,8,1},{2,7,4}};
        System.out.println(checkValid(gird));
    }
    public static boolean checkValid(int[][] gird){
        if(gird[0][0] != 0) return false;
        return helper(gird,0,0,0);
    }
    public static boolean helper(int[][] gird, int row, int col, int num){
        int n = gird.length;
        if(gird[row][col]==n*n-1) return true;
        int i,j;
        //2 up 1 right
        i=row-2;
        j=col+1;
        if(i>=0 && j<n && gird[i][j]==num+1) return helper(gird,i,j,num+1);
        //2 up 1 left
        i=row-2;
        j=col-1;
        if(i>=0 && j>=0 && gird[i][j]==num+1) return helper(gird,i,j,num+1);
        //2 down 1 right
        i=row+2;
        j=col+1;
        if(i<n && j<n && gird[i][j]==num+1) return helper(gird,i,j,num+1);
        //2 down 1 left
        i=row+2;
        j=col-1;
        if(i<n && j>=0 && gird[i][j]==num+1) return helper(gird,i,j,num+1);
        //2 left 1 up
        i=row-1;
        j=col-2;
        if(i>=0 && j>=0 && gird[i][j]==num+1) return helper(gird,i,j,num+1);
        //2 left 1 down
        i=row+1;
        j=col-2;
        if(i<n && j>=0 && gird[i][j]==num+1) return helper(gird,i,j,num+1);
        //2 right 1 up
        i=row-1;
        j=col+2;
        if(i>=0 && j<n && gird[i][j]==num+1) return helper(gird,i,j,num+1);
        //2 right 1 down
        i=row+1;
        j=col+2;
        if(i<n && j<n && gird[i][j]==num+1) return helper(gird,i,j,num+1);
        return false;
    }
}
