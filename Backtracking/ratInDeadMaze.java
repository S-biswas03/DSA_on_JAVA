public class ratInDeadMaze{
    public static void main(String[] args){
        int rows = 4;
        int cols = 6;
        int[][] maze = {{1,0,1,1,1,1},
    {1,1,1,1,0,1},
    {0,1,1,1,1,1},
    {0,0,1,0,1,1}};
        print(0,0,rows-1,cols-1,"",maze);
    }
    public static void print(int sr, int sc, int er, int ec, String s,int[][] maze){
        if(sr>er || sc>ec) return;
        if(sc==ec && sr==er){
            System.out.println(s);
            return;
        }
        if(maze[sr][sc]==0) return;
        print(sr,sc+1,er,ec,s+"R",maze);  //right
        print(sr+1,sc,er,ec,s+"D",maze);  //down
        
    }
}