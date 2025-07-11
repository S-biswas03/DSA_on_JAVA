public class selectionSort{
    public static void main(String[] args) {
        int[] arr = {5,6,2,8,4,3,1};
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        int n = arr.length;
        for(int i=0; i<n-1; i++){   //for n-1 passes
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for(int j=i; j<n; j++){    //swaping min number and i 
                if(min > arr[j]){
                    min = arr[j];
                    mindx = j;
                }
            }
            int temp = arr[i];
                arr[i] = arr[mindx];
                arr[mindx] = temp;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}