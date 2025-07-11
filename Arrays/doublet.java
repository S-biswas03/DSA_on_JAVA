import java.util.Scanner;
public class doublet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        System.out.print("Enter elements of the array : ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        sc.close();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] + arr[j] == x){
                    System.out.println("The sum of numbers in the indices " + i + " & " + j + " is equal to : " + x);
                }
            }
        }
    }
}
