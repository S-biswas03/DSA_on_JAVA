package BinarySearch;
import java.util.*;
public class Leetcode1539{
    public static int findKthPositive(int[] arr, int k){
        int lo = 0, hi = arr.length-1;
        while(hi>=lo){
           int mid = lo+(hi-lo)/2;
           int missed = arr[mid] - (mid+1); //KITNE NUMBER MISSING HAIN USKE LIYA {INDEX+1 YE VALA NUMBER HONA CHAHIYE} 
           //& ABHI JO HAIN USME SE JO HONA CHAHIYE USKO MINUS KAR DENGE TO PATA CHAL JAYEGA.
           if(missed<k) lo = mid+1;
           else hi = mid-1;
        }
        //KTH MISSING NUMBER = ARR[HI] + EXTRA
        // EXTRA = K - [ARR[HI] - (HI+1)]   lo = hi+1 ---> loop break hone k baad
        System.out.println(k + lo);
    return k + lo;  //AGAR LOOP BREAK HOTA HAIN TO HUMESHA LO = HI+1
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,3,4,7,11};
        System.out.print("Enter value of k : ");
        int k = sc.nextInt();   // K IS THE MISSING NUMBER TO BE FOUND
        findKthPositive(arr,k);
        sc.close();
    }
}