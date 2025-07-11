//KUCH ERROR HAIN

public class kthSmallest {
    static int ans ;
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr, int lo, int hi){
        int pivot = arr[lo];
        int count = 0;
        for(int i=lo+1; i<hi; i++){
            if(arr[i]<=arr[lo]) count ++;
        }
        int correctIdx = lo + count;
        swap(arr,lo,correctIdx);

        int i=lo, j=hi;
        while(i<correctIdx && j>correctIdx){
            if(arr[i] < pivot) i++;
            else if(arr[j] > pivot) j--;
            else if(arr[i]>pivot && arr[j]<pivot) swap(arr,i,j);
        }
        return correctIdx;
    }
    public static void quickSelect(int[] arr,int lo, int hi, int k){
        if(lo>hi) return;
        if(lo==hi){
            if(lo==k-1) ans = arr[lo];
        }
        int idx = partition(arr,lo,hi);
        if(idx==k-1){
            ans = arr[idx];
        }
        else if(k-1 < idx){
            quickSelect(arr,lo,idx-1,k);
        }
        else quickSelect(arr,idx+1,hi,k);
        
    }
    public static void main(String[] args){
        int k = 2;
        ans = -1;
        int[] arr = {4,9,7,1,2,3,6};
        int n = arr.length;
        print(arr);
        quickSelect(arr,0,n-1,k);
        System.out.println(ans);
    }
}
