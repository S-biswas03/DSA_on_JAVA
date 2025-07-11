package RECURSION;
import java.util.*;
public class sumOfN{
    public static void sum(int n,int ans){
        // int ans = 0;
        // if(n>0){
        //     ans = n + sum(n-1);
        // }
        // return ans;
        
        //PARAMETERIZED
        
        if(n==0){
           System.out.println(ans);
           return;
        }
        sum(n-1,ans+n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sum(n,0);
        sc.close();
    }
}