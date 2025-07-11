public class changingPivot {
    public static void swap(int[] arr, int i, int j){
        int temp =  arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static int partition(int[] arr, int lo, int hi){
        int mid = (lo+hi)/2;
        int pivot = arr[mid] , pIdx = lo;
        int smallerCount = 0;
        for(int i=lo+1; i<=hi; i++){
            if(i==mid) continue;
            if(arr[i]<=arr[lo]) smallerCount++;
        }
        int correctIdx = lo + smallerCount;
        //swaping pivot element with element of correct index
        swap(arr,lo,correctIdx);
        //original partition and swaping
        int i=lo, j=hi;
        while(i<correctIdx && j>correctIdx){
            if(arr[i]<pivot) i++;
            else if(arr[j]>pivot) j--;
            else if(arr[i]>pivot && arr[j]<pivot){
                swap(arr,i,j);
            }
        }
        return correctIdx;
    }
    public static void quickSort(int[] arr, int lo, int hi){
        if(lo>=hi) return;
        //pivot (arr[lo]) ko sahi jagah rakho
        //aur left part <= pivot and right > pivot
        int idx = partition(arr,lo,hi);
        //RECURION KA JADU
        quickSort(arr, lo, idx-1);
        quickSort(arr, idx+1, hi);
    }
    public static void main(String[] args){
        int[] arr = {4,9,7,1,2,3,6,5,8};
        int n = arr.length;
        print(arr);
        quickSort(arr,0,n-1);
        print(arr);
    }
}
