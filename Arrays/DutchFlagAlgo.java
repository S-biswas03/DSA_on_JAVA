public class DutchFlagAlgo {
    public static void swap(int[]arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args){
        int[] arr = {1, 0, 2, 1, 2, 1, 0, 2, 1, 0, 2, 0};
        int n = arr.length;
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
     
        int lo=0, mid=0, hi=n-1;

        while(mid <= hi){
            if(arr[mid] == 0){
               int temp = arr[lo];
               arr[lo] = arr[mid];
               arr[mid] = temp;
               lo++;
               mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                hi--;
            }
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
