package RECURSION;
import java.util.*;
public class gcd {
    public static int greatestCommonDivisor(int a, int b){
        if(b%a==0) return a;
        return greatestCommonDivisor(b%a, a);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number a : ");
        int a = sc.nextInt();
        System.out.print("Enter a number b: ");
        int b = sc.nextInt();
        System.out.println(greatestCommonDivisor(a,b));
        sc.close();
    }
}
