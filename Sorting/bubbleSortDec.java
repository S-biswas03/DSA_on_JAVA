public class bubbleSortDec {
    public static void main(String[] args){
        int[] arr = {1,4,6,3,9,5,0,7};
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            boolean flag = true;
            for(int j=0; j<n-1-i; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if(flag == true) break; 
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
