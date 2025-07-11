// package TwoDimensionalArrays;
//SQUARE MATRIX ONLY.

import java.util.*;
public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int m = sc.nextInt();
        System.out.println("Enter number of columns : ");
        int n = sc.nextInt();
        int arr[][] = new int [m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.println("Enter element of row " + i + " and column " + j);
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

        System.out.println("Transposed array is : ");
        for(int i=0; i<m; i++){
            for(int j=0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
