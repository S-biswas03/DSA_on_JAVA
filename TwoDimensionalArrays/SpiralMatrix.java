import java.util.Scanner;
public class SpiralMatrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("Enter element of row "+ i + " and column " + j + ": ");
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("The given array is : ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int rmax = m-1;
        int rmin = 0;
        int cmax = n-1;
        int cmin = 0;

        System.out.println("Wavefome of the array is : ");
        while(rmax>=rmin && cmax>=cmin){
        for(int j=cmin; j<=cmax; j++){
            System.out.print(arr[rmin][j] + " ");
        }
        rmin++;
        if(rmin>rmax || cmin>cmax) break;
        
        for(int i=rmin; i<=rmax; i++){
            System.out.print(arr[i][cmax] + " ");
        }
        cmax--;
        if(rmin>rmax || cmin>cmax) break;

        for(int j=cmax; j>=cmin; j--){ 
            System.out.print(arr[rmax][j] + " ");
        }
        rmax--;
        if(rmin>rmax || cmin>cmax) break;

        for(int i=rmax; i>=rmin; i--){
            System.out.print(arr[i][cmin] + " ");
        }
        cmin++;
        if(rmin>rmax || cmin>cmax) break;

        }

    }
}