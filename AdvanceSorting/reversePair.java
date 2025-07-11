//LEETCODE 493
//0<=i < j <arr.length
//arr[i] > 2*arr[j]
public class reversePair{

    static int count;
    public static void merging(int[] a, int[] b, int[] c){
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i] <= b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
    }
    public static void inversion(int[] a, int[] b){
        int i=0, j=0;
        while(i<a.length && j<b.length){
            if(a[i] > 2*b[j]){
                count += a.length-i;
                i++;
            }
            else j++;
        }
    }
    public static void sorting(int[] arr){
        int n = arr.length;
        if(n==1) return;
        //array banaya
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        //copy paste
        for(int i=0; i<n/2; i++) a[i] = arr[i];
        for(int i=0; i<n-n/2; i++) b[i] = arr[i+n/2];
        //sort arrays a and b
        sorting(a);
        sorting(b);
        //reversPair
        inversion(a,b);
        //Merging two sorted arrays to get 1 sorted array
        merging(a, b, arr);
        a=null; b=null;
    }

    public static void main(String[] args){
        int[] arr = {1,5,2,4,1};
        count = 0;
        sorting(arr);
        System.out.println(count);
    }
}