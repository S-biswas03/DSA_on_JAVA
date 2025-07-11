package RECURSION;
import java.util.*;
public class printNto1 {
    public static void print(int n){
        if(n>0){
            System.out.print(n + " ");
            print(n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        print(n);
        sc.close();
    }
}
