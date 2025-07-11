public class mazePath{
    public static void main(String[] args){
        int rows = 4;
        int col = 6;
        int count = maze(1,1,rows,col);
        printPath(1,1,rows,col, "");
        System.out.print(count);
    }
    public static int maze(int sr, int sc, int er, int ec){
        if(sr>er || sc>ec) return 0;
        if(sr==er && sc==ec) return 1;
        int downWays = maze(sr+1, sc, er, ec);
        int rightWays = maze(sr, sc+1, er, ec);
        int totalWays = downWays + rightWays;
        return totalWays;
    }

    public static void printPath(int sr, int sc, int er, int ec, String s){
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        //go down
        printPath(sr+1, sc, er, ec, s+"D");
        //go right
        printPath(sr, sc+1, er, ec, s+"R");
    }
}