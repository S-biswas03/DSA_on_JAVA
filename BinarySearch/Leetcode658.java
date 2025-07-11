//ERROR HI ERROR HAIN DONT USE THIS

package BinarySearch;

import java.util.Scanner;

//k closest elements
public class Leetcode658{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,5,6,7};
        int n = arr.length;
        System.out.print("Enter value of target: ");
        int x = sc.nextInt();
        System.out.print("Enter value of k : ");
        int k = sc.nextInt();

        if(x<arr[0]){
            for(int i=0; i<k; i++){
                System.out.print(arr[i] + " ");
            }
        }
        if(x>arr[n-1]){
            for(int i=n-1-k; i<=n-1; i++){
                System.out.print(arr[i] + " ");
            }
        }
        int lo=0, hi= n-1;
        int lb = n;
        int mid = lo + (hi-lo)/2;

        if(arr[mid] >= x){
            lb = arr[mid];
            hi = mid - 1;
        }
        else lo=mid+1;

        int j=lb, i=lb-1;
        while(k>0 && i>=0 && j<n){
            int di = Math.abs(x-arr[i]);
            int dj = Math.abs(x-arr[j]);
            if(di<=dj){
                System.out.print(arr[i] + " ");
                i--;
            }
            else{
                System.out.print(arr[j] + " ");
                j++;
            }
            k--;
        }
        while(i<0 && k>0){
            System.out.print(arr[j] + " ");
            j++;
            k--;
        }
        while(j==n && k>0){
            System.out.print(arr[i] + " ");    
            i--;
            k--;
        }
        sc.close();

    }
}