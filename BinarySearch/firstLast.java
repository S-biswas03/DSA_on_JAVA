package BinarySearch;

import java.util.Scanner;

public class firstLast{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,10,20,20,20,20,30,30,30,40,40,50}; 
        int n= arr.length;
        System.out.print("Enter a target value: ");
        int x = sc.nextInt();
        int lo =0, hi=n-1;
        boolean flag = false;
        while(hi>=lo){
            int mid = lo + (hi-lo)/2;
            if(arr[mid] > x) hi = mid-1;
            else if(arr[mid] < x) lo = mid+1;
            else{
                flag = true;
                break;
            }
        }
        if(flag == false){
            System.out.print("Given number is not present.");
        }
        else{
            lo = 0; hi = n-1;
            int lb = n, ub = n;
            while(hi >= lo){
                int mid = lo + (hi-lo)/2;
                if(arr[mid] >= x){
                    lb = Math.min(lb,mid);
                    hi = mid-1;
                }
                else{
                    lo = mid+1;
                }
            }
            System.out.print("First index of the given value is : " + lb);
            System.out.println();
            lo = 0; hi = n-1;
            while(hi >= lo){
                int mid = lo + (hi-lo)/2;
                if(arr[mid] > x){
                    ub = Math.min(mid,ub);
                    hi = mid-1;
                }
                else{
                    lo = mid+1;
                }
            }
    
            int lastIdx = ub -1;

            System.out.print("The last index of the given value is : " + lastIdx);
            System.out.println();
            int noOfTimes = ub - lb;
            System.out.print("Total number of times the given number occurs is : " + noOfTimes);

            sc.close();
        }
    }
}