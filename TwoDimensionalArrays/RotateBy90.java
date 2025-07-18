import java.util.*;
public class RotateBy90 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int m = sc.nextInt();
        int arr[][] = new int [m][m];
        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                System.out.println("Enter element of row " + i + " and column " + j);
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transposed array is : ");
        for(int i=0; i<m; i++){
            for(int j=0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Rotated array is : ");
        for(int i=0; i<m; i++){
            int a=0 , b=m-1;
            while(a<b){
                int temp = arr[i][a];
                arr[i][a] = arr[i][b];
                arr[i][b] = temp;
                a++;
                b--;
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
