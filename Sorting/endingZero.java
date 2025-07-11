public class endingZero{
    public static void main(String[] args){
        int[] arr = {1,0,4,0,2,-40,100,0,5};
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        int n = arr.length;
        for(int i=0; i<n-1; i++){// number of passes
            boolean flag = true;
            for(int j=0; j<n-1; j++){// for pushing zeros at the endi
                if(arr[j] == 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if(flag == true) break;
        }for(int ele : arr){
            System.out.print(ele + " ");
        }

    }
}