package RECURSION;
import java.util.*;
public class maizePath{
    public static int noOfWays(int r, int c, int m, int n){
        // if(r==m || c==n) return 1;
        if(r==m && c==n) return 1;
        if(r>m && c>n) return 0;
        int rightways = noOfWays(r, c+1, m, n);
        int downways = noOfWays(r+1, c, m, n);
        
        return rightways+downways;
    }
    public static int maze(int m, int n){
        if(m==1 || n==1) return 1;
        int rightWays = maze(m,n-1);
        int downWays = maze(m-1,n);
        return rightWays + downWays;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int n = sc.nextInt();
        // System.out.print(noOfWays(1, 1, m, n));
        System.out.print(maze(m, n));
        sc.close();

    }
}