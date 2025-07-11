// package TwoDimensionalArrays;

import java.util.Scanner;

public class SumOfElements{
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

        int sum = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                sum += arr[i][j];
            }
        }
        System.out.println("Sum of elements of the given array is : " + sum);
    }
}

