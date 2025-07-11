
import java.util.Arrays;
public class builtin {
    public static void main(String[] args) {
        int[] arr = {5 , 13 , 1, 2 , 8 ,0, 65, 32};
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr);
        System.out.println();
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
