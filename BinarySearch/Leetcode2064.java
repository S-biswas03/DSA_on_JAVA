package BinarySearch;
import java.util.Scanner;

public class Leetcode2064 {
    public static boolean isPossible(int maxQ, int n , int[] arr){
        int stores = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%maxQ == 0) stores += arr[i] / maxQ;
            else stores += arr[i] / maxQ + 1;
        }
        if(stores>n) return false;
        else return true;
    }

    public static int minimizeMaximum(int n ,int[] arr){
        //int length = arr.length;
        int max = -1;
        for(int i=0; i<n; i++){
            max = Math.max(max,arr[i]);
        }
        int lo=1 , hi = max;
        int maxAns = 1;
        
        while(hi>=lo){
            int mid = lo + (hi-lo)/2;
            if(isPossible(mid,n,arr)){
                maxAns = mid;
                hi=mid-1;
            }
            else lo = mid+1;
        }

        return maxAns;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {15,10,10};
        System.out.print("Enter number of stores : ");
        int n = sc.nextInt();
        minimizeMaximum(n,arr);
        System.out.println(minimizeMaximum(n, arr));
        sc.close();
    }
}
