public class selectionSortDec {
    public static void main(String[] args){
        int[] arr = {5,3,1,8,7,9,2};
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int max = Integer.MIN_VALUE;
            int maxdx = -1;
            for(int j=0; j<n-i; j++){
                if(arr[j] > max){
                    max = arr[j];
                    maxdx = j;
                }
            }
            if(maxdx != -1){
            int temp = arr[n-1-i];
            arr[n-1-i] = arr[maxdx];
            arr[maxdx] = temp;
            }
            System.out.print("Pass " + (i+1) + ":");
            for(int ele:arr){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        System.out.println("Sorted array is :");
        for(int ele:arr){
            System.out.print(ele + " ");
        }
    }
}
