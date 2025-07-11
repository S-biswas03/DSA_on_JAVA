package RECURSION;
import java.util.*;
public class increasingAfterCalll {
    public static void print(int n){
        if(n==0) return;    //AGAR N=0 HO JATA HAIN TO END
        print(n-1);         //PEHLE N-1 KARTE KARTE 0 TAK JAYEGA USE BAAD PRINTING KAREGA 
        System.out.print(n+" ");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        print(n);
        sc.close();
    }
}
