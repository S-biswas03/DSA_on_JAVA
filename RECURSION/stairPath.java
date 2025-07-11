//ONLY ONE OR TWO STEPS AT A TIME IS ALLOWED
package RECURSION;

import java.util.Scanner;

public class stairPath {
    public static int stair(int n){
        if(n<=2) return n;
        int ans = stair(n-1) + stair(n-2);
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println(stair(n));
        sc.close();
    }
}
