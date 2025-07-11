package BinarySearch;

import java.util.Scanner;

public class lowerBound {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,30,40,50,60,70};
        int n = arr.length;
        System.out.print("Enter a target value: ");
        int target = sc.nextInt();
        int lo=0, hi=n-1;
        int lb = n;
        while(hi>=lo){
            int mid = lo + (hi-lo)/2;   //middle index find out kiya
            if(arr[mid]>=target){       //agar mid idx ka element >= target hain to
                lb = Math.min(lb,mid);  //lb and mid me se lower value lb ban jayega 
                hi = mid-1;             //kyuki mid target se bada hain isliya left jayenge to hi-1 karenge
            }
            else lo = mid+1;            //agar mid chota hain target se to right jayenge isliya lo = mid+1
        }
        sc.close();
        System.out.print(lb);
    }
}