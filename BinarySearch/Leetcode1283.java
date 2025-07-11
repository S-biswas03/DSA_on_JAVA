//ERROR HAIN DONT FOLLOW
package BinarySearch;

import java.util.Scanner;

public class Leetcode1283 {//ans by adding the quotient must be smaller than threshold AND THE DIVISOR MUST BE SMALLEST.
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int[] array = {44,22,33,11,1};
        System.out.println("Enter a threshold value : ");
        int t = sc.nextInt();
        smallestDivisor(array,t);
        sc.close();
    }

        public static int smallestDivisor(int[] arr, int threshold){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max = Math.max(arr[i],max);
        }
        int d = 1;
        int lo=1, hi=max;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            int sum = 0;
            for(int i =1;i<=n;i++){
                if(arr[i]%mid == 0) sum+=arr[i]/mid;
                else sum += arr[i]/mid + 1;
            }           
            if(sum<threshold){
                d = mid;
                hi = mid-1;
            }
            else lo = mid+1;
            // for(int i=0; i<n; i++){
            //     if(arr[i]%d == 0) sum+=arr[i];
            //     else sum += arr[i]/d + 1;
            // }
            // if(sum<=threshold){
            //     System.out.println(d);
            //     // return d;
            //     break;
            // } 
        }
        return d;
        
    }
}
