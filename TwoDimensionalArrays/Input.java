// package TwoDimensionalArrays;

import java.util.Scanner;

public class Input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][4];
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.println("Enter element of row " + i + "and column " + j + " :");
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}