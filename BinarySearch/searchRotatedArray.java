//bekar code Leetcode 33
package BinarySearch;

import java.util.*;
public class searchRotatedArray{
    public static int bs(int[] arr,int lo,int hi, int target){
            while(hi>=lo){
                int mid = lo+(hi-lo)/2;
                if(arr[mid]==target) return mid;
                else if(arr[mid]>target) hi=mid-1;
                else if(arr[mid]<target) lo=mid+1; 
            }
            return -1;
        }
    public static int main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,4,5,6,7,0,1,2};
        int n= arr.length;

        System.out.print("Enter a number : ");
        int target = sc.nextInt();
        sc.close();
        if(n<=2){
            for(int i=0;i<n;i++){
                if(arr[i]==target) return i;
            }
            return -1;
        }
    
        int lo=1, hi=n-2;
        int pvt = -1 ;
        while(hi>=lo){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                pvt = mid;
                break;
            }
            else if(arr[mid]<arr[mid-1] && arr[mid]<arr[mid+1]){
                pvt = mid - 1;
                break;
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) {
                if(arr[mid]>arr[n-1]) lo = mid+1;
                else hi = mid-1;
            }
        }
        if(pvt == -1){
            return bs(arr,0,n-1,target);
        }
        int left = bs(arr,0,pvt,target);
        if(left!=-1) return left;

        int right = bs(arr,pvt+1,n-1,target);
        return right;
        
    }
}