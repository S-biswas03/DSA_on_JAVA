package BinarySearch;

import java.util.Scanner;

public class basic{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,15,23,34,81,105,180,500};
        int n = arr.length;
        System.out.print("Enter a target value: ");
        int target = sc.nextInt();
        int low=0, hi=n-1;   
        boolean flag = false;
        while(hi>=low){
            int mid = (hi+low)/2;
            if(arr[mid]>target) hi = mid-1;
            else if(arr[mid]<target) low = mid+1;
            else if(arr[mid] == target){
                flag = true;
                break;
            }
        }
        if(flag==true) System.out.print("Target found.");
        else System.out.print("Entered value is not found.");
        sc.close();
    }
}