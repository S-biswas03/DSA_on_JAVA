package BinarySearch;
import java.util.*; 
public class upperBound {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] arr = {10,20,30,40,40,55,64,78};
    int n = arr.length;
    System.out.print("Enter a target value: ");
    int x = sc.nextInt();
    int lo=0, hi=n-1; 
    int ub = n;
    while(hi>=lo){
        int mid = lo + (hi-lo)/2;
        if(arr[mid]>x){
            ub = Math.min(mid, ub);
            hi = mid-1;
        }
        else {
            lo = mid+1;
        }
    }
    System.out.print(ub);
    sc.close();
    }
}
