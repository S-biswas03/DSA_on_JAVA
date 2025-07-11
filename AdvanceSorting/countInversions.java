//package AdvanceSorting;
public class countInversions{
    static int count ;
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void inversion(int[] a, int[] b){
        int i=0, j=0;
        while(i<a.length && j<b.length){
            if(a[i]>b[j]){
                count += a.length - i;
                j++;
            }
            else i++;
        }
    }
    public static void mergeSort(int[] a, int[] b, int[] arr){
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i] <= b[j]) arr[k++] = a[i++];
            else arr[k++] = b[j++];
        }
        while(i<a.length) arr[k++] = a[i++];
        while(j<b.length) arr[k++] = b[j++];
    }
    public static void merge(int[] arr){
        int n = arr.length;
        if(n==1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        for(int i=0; i<n/2; i++) a[i] = arr[i];
        for(int i=0; i<n-n/2; i++) b[i] = arr[i+n/2];
        merge(a);
        merge(b);

        inversion(a,b);

        mergeSort(a, b, arr);
        a = null; b = null;
    }
    
    
    public static void main(String[] args){
        int[] arr = {1,3,9,5,8,4};
        print(arr);
        merge(arr);
        print(arr);
        System.out.println(count);
    }
}