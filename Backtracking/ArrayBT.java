public class ArrayBT {
    public static void printArray(int[] arr){
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void changeArray(int[] arr,int i, int value){
        if(value == 6){
            printArray(arr);
            return;
        }

        arr[i] = value;
        changeArray(arr, i+1, value+1);
        arr[i] = arr[i] - 2;
    }
    public static void main(String[] args){
        int[] arr = new int[5];
        changeArray(arr,0,1);
        printArray(arr);
    }
}
