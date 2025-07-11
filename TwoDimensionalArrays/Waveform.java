import java.util.Scanner;
public class Waveform{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print("Enter element of row "+ i + " and column " + j + " :");
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("Given array is : ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("WAve for, of the given array is : ");
        for(int i=0; i<m; i++){
            if(i%2 != 0){
            for(int j=n-1; j>=0; j--){
                    System.out.print(arr[i][j] + " ");
                }
            }
            else if(i%2 == 0){
                for(int j=0; j<n; j++){
                    System.out.print(arr[i][j] + " ");
                }
            }
            
            System.out.println();
        }
    }
}