import java.util.*;
public class SortingTwoD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int m = arr.length, n = arr[0].length; 
        System.out.print("Enter a target value : ");
        int target = sc.nextInt();
        sc.close();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        //TIME CONSUMING METHOD
        
        // boolean flag = false;
        // for(int i=0; i<m; i++){    
        //     for(int j=0; j<n; j++){
        //         if(arr[i][j]==target) flag = true;
        //         else flag = false;
        //     }
        // }
        // if(flag == true) System.out.print("Target found.");
        // else System.out.print("Target not found.");

        int i=0, j=n-1;
        while(i<m && j>=0){
            if(arr[i][j] == target) {
                System.out.println("Target found");
                break; 
            }
            else if(arr[i][j] > target) j--;
            else if(arr[i][j] < target) i++;
            else System.out.println("Target not found");
        }
        
        

    }
}
