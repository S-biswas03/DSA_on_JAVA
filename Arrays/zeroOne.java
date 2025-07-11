public class zeroOne {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0, 0, 1, 1};
        int n = arr.length;
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        // int noOfZeros = 0;
        // for(int i=0; i<n; i++){
        //     if(arr[i]==0)
        //     noOfZeros++;
        // }
        // for(int i=0; i<n; i++){
        //     if(i < noOfZeros) arr[i] = 0;
        //     else arr[i] = 1;
        // }
        // for(int i=0; i<n; i++){
        // System.out.print(arr[i] + " ");
        // }
        int i=0, j=n-1;
        while(i < j){
            if(arr[i] == 0) i++;
            if(arr[j] == 1) j--;
            if(i>j) break;
            if(arr[i]== 1 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        for(i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
