package RECURSION;

public class taversingArray {
    public static void traverse(int i , int[] arr){
        if(i==arr.length) return;
        System.out.print(arr[i] + " ");
        traverse(i+1,arr);
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,3,8,9,2};
        traverse(0,arr);
    }
}
