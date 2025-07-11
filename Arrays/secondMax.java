import java.util.Scanner;
public class secondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of the array : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int smax = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i] != max){
                smax = arr[i];
            }
        }
        System.out.println("Second largest element in the given array is : "+  smax);

    }    
}
