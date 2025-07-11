import java.util.*;
public class outputOfArray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array.");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
