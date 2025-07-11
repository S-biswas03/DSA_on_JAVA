import java.util.Scanner;
public class minumum {
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
    int min = Integer.MAX_VALUE;
    for(int i=0; i<n; i++){
        if(arr[i] < min){
            min = arr[i];
        }
    }
    System.out.println("The minimum number in the given array is : " + min);
}

}
