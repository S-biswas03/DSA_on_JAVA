import java.util.Scanner;

public class rotateByk {
    public static void reverse (int[] arr,int i,int j){
        while(i<=j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();

        int n = arr.length;
        System.out.print("Enter number of rotations : ");
        int k = sc.nextInt();
        sc.close();
        if(k>n) k = k%n;
        reverse(arr, 0, n-1);       //reverse(arr, 0, n-k-1)
        reverse(arr, 0, k-1);       //reverse(arr, n-k, n-1)
        reverse(arr, k, n-1);         //reverse(arr, 0, n-1)  

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

        
    }
}
