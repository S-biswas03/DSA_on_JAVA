package RECURSION;
import java.util.*;
public class aRaisedToThePowerb {
    // public static int power(int a, int b){       TC = O(B)
    //     if(b==0) return 1;
    //     return a * power(a,b-1);
    // }

    //Log 
    public static int powerLog(int a, int b){       //TC = O(LOG B)
        if(b==0) return 1;
        int ans = powerLog(a,b/2);
        if(b%2==0) return ans*ans;
        else return ans*ans*a;        
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value of a numbers : ");
    int a = sc.nextInt(); 
    System.out.print("Enter value of b numbers : ");
    int b = sc.nextInt();
    int x = powerLog(a,b);
    System.out.print(a + " raised to the power " + b + " is equal to : " + x);
    sc.close();
    }
}
