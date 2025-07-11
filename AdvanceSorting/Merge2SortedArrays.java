//package AdvanceSorting;
public class Merge2SortedArrays{
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
    public static void mergeArray(int[] arr, int[] brr, int[] crr){
        int i=0, j=0, k=0;
        while(i<arr.length && j<brr.length){
            if(arr[i] < brr[j]){
                crr[k] = arr[i];
                i++;
            }
            else{
                crr[k] = brr[j];
                j++;
            }
            k++;
        }        
        while(j<brr.length) crr[k++] = brr[j++];
        while(i<arr.length) crr[k++] = arr[i++];  
    }
    public static void main(String[] args){
        int[] arr = {10,40,60,80,90};
        int[] brr = {15,20,25,55};
        int[] ans = new int[arr.length + brr.length];
        mergeArray(arr, brr, ans);
        print(ans);
    }
}