//TRANSFER WEIGHTS IN GIVEN D DAYS BY MINIMIZING CAPACITY AND USING ALL DAYS SENDING EACH PACKAGE IN ORDER
package BinarySearch;
import java.util.*;

public class Leetcode1011 {
    public static boolean isPossible(int C, int[]arr, int d){
        int n = arr.length;
        int load = 0;
        int days = 1;
        for(int i=0;i<n;i++){
            if(load+arr[i]<=C) load+=arr[i];
            else{
                load = arr[i];
                days ++;
            }
        }
        if(days>d) return false;
        else {
            // System.out.println("Capacity is : " + C);
            return true;
        } 
        }

        public static int shipWithinDays(int[] arr, int d){
            int n = arr.length;
            int sum = 0, max = Integer.MIN_VALUE;
            for(int i=0; i<n; i++){
                max = Math.max(max,arr[i]);
                sum += arr[i];
            }
            int lo = max, hi=sum, minC=sum;
            while(lo<=hi){
                int mid = lo + (hi-lo)/2;
                if(isPossible(mid,arr,d)==true){
                minC = mid;
                hi = mid-1;
            }
        }
        return minC;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Enter number of Days : ");
        int d = sc.nextInt();
        shipWithinDays(arr,d);
        sc.close();
    }
}
 