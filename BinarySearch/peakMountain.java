package BinarySearch;
public class peakMountain{
    public static void main(String[] args){
        int[] arr = {10,20,30,40,60,30,20,10};
        int n = arr.length;
        int lo=0, hi=n-1;
        while(hi>=lo){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                System.out.print("The peak value is having the index : " + mid);
                break;
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) lo = mid+1;
            else if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]) hi = mid-1;
        }
    }
}