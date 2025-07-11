import java.util.Scanner;
public class Wave2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows/ columns : ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("Enter element of row "+i + " and column " +j + " : ");
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for(int i=0; i<n; i++){
            if(i%2 == 0){
                for(int j=0; j<n; j++){
                    System.out.print(arr[i][j] + " ");
                }
            }
            else{
                for(int j=n-1; j>=0; j--){
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
