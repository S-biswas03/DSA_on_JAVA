package Heaps;
import java.util.*;
public class HeapSort {     //TC = O(nlogn)
    public static void heapify(int[]arr, int idx, int size){
        int left = 2*idx +1;
        int right = 2*idx + 2;
        int maxIdx = idx;
        
        if(left<size && arr[left]>arr[maxIdx]){
            maxIdx = left;
        }
        if(right<size && arr[right]>arr[maxIdx]){
            maxIdx = right;
        }
        if(maxIdx != idx){
            //swap arr[idx] and arr[maxIdx]
            int temp = arr[idx];
            arr[idx] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr, maxIdx, size);
        }

    }
    public static void heapSort(int []arr){
        //step 1 build maxHeap
        int n = arr.length;
        for(int i=n/2; i>=0; i--){
            heapify(arr,i,n);
        }
        //step 2 push largest element at end
        for(int i = n-1; i>0; i--){
            //swap 0th idx with n-1th idx
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr,0,i);
        }
    }
    public static void main(String[] args){
        int arr[] = {1,2,4,5,3};

        heapSort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
