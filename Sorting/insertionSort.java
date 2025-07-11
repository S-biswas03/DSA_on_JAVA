public class insertionSort{
    public static void main(String[] args){
        int[] arr = {1,8,4,6,5,3,7,6};
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        int n= arr.length;
        for(int i=1; i<n; i++){     //for number of passes or swapping one number to move it to correct place. i.e. n-1
            for(int j=i; j>0; j--){
                if(arr[j] < arr[j-1]){  //for swapping the j-1 index number with jth index number until it reaches its correct position.
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                }
                else break;         //if the above statement does not run the number is aleady at its correct place.
            }
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}