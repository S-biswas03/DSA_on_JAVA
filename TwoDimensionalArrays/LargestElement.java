// package TwoDimensionalArrays;
import java.util.Scanner; 

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int m = sc.nextInt();
        System.out.println("Enter number of columns : ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.println("Enter elements of row "+ i + " and column " + j);
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Largest element in the given 2D array is : " + max);
    }
}
