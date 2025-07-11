package BinarySearch;

import java.util.Scanner;

public class sqrtX{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        int lo=0, hi=x;
        while(hi>=lo){
            int mid = lo + (hi-lo)/2;
            if(mid*mid == x){
                System.out.print("The square root of the given number is : "+ mid);
                break;
            }
            else if(mid*mid > x) hi = mid-1;
            else if(mid*mid < x) lo = mid+1;
        }
        if(hi<lo) System.out.print("The square root of the enterd number is : " + hi);
        sc.close();
    }
}