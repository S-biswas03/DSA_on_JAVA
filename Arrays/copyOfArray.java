import java.util.*;
public class copyOfArray {
    public static void main(String[] args) {
        int arr[] = {30, 10, 45, 55, 62};
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        int[] nums = arr;   //SHALLOW COPY --> LIKE PASS BY REFERENCE --> original array me bhi change hota hain
        nums[0] = 90;
        System.out.println("1st element of array arr : " + arr[0]); 
        System.out.println("1st element of array nums: " + nums[0]);

        int[] brr = Arrays.copyOf(arr, arr.length); //DEEP COPY --> CHANGES IN NEW ARRAY HAS NO EFFECT ON ORIGINAL ARRAY
        for(int ele : brr){
            System.out.print(ele + " ");
        }
        System.out.println();
        brr[0] = 37;
        System.out.println("1st element of array brr : " + brr[0]);
        System.out.println("1st element of array arr : " + arr[0]);
    }
}
