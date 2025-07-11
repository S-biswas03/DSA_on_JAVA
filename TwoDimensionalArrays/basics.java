// package TwoDimensionalArrays;

public class basics {
    public static void main(String[]args){
        int[][] arr = new int[3][4];
        arr[0][0] = 5;
        arr[0][1] = 7;
        arr[0][2] = 9;
        arr[0][3] = 11;
        arr[1][0] = 3;
        arr[1][1] = 6;
        arr[1][2] = 9;
        arr[1][3] = 12;
        arr[2][0] = 4;
        arr[2][1] = 8;
        arr[2][2] = 12;
        arr[2][3] = 16;
        
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
