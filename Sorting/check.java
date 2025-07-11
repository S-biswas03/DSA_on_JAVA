
public class check{
    public static void main(String[] args) {
        int[] arr = {1,3,6,7,8,12};
        boolean check = false;
        for(int i=0; i<arr.length-1; i++){      
        if(arr[i]>arr[i+1]) {
            check = false;
            break;
        }
        else check = true;
        }
    if(check==true) System.out.println("Sorted array");
    else System.out.println("Unsorted array.");

    }
}