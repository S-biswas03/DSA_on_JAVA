import java.util.Scanner;
public class sumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of the array : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + arr[i];
        }
        System.out.println("The sum of all the elements of the given array is : " + sum);
    }
    
    
}
