public class reverseUsing2pointer {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50, 60};
        int n = arr.length;
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        int i=0;
        int j = n-1;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
