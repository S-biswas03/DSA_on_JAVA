package RECURSION;
import java.util.Scanner;
public class binaryString {
    public static void result(String s, int n){
        if(s.length()==n){
            System.out.println(s);
            return;
        }
        int length = s.length();
        if(length==0 || s.charAt(length-1)=='0'){
            result(s+0, n);
            result(s+1, n);
        }
        else result(s+0, n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        result ("", n);
        sc.close();
    }
}
