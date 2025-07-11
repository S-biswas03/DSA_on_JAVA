package BinarySearch;

import java.util.Scanner;

public class Leetcode33{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {7,8,9,0,1,2,3,4,5,6};
        int n = arr.length;
        System.out.println("Enter a target value : ");
        int target = sc.nextInt();
        if(target<arr[0] || target>arr[n-1]){
            System.out.println("Target is not present in the given array.");
        }
        int lo=0, hi=n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid] == target) {
                System.out.println("The target element is in the index number : " + mid);
                break;
            }
            else if(arr[mid]<=arr[hi]){//target in the rigth sorted array mid to hi every thing sorted
                if(target>arr[mid] && target<=arr[hi]) lo=mid+1;//target is in the right
                else hi = mid-1;
            }
            else if(arr[mid]>arr[hi]){//target in the left sorted array
                if(target>=arr[lo] && target<arr[mid]) hi=mid-1;//target is in the left
                else lo = mid+1;
            }
        }
        sc.close();

    }
}