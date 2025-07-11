public class FlippingMatrix {
    public static void print(int[][] a ){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    } 

    public static void main(String[] args){
        int m = 3, n = 4;
        int[][] arr = {{0,0,1,1}, {1,0,1,0}, {1,1,0,0}};
        print(arr);
        //TO MAKE 1ST COLUMN OF EVERY ROW 1
    for(int i=0; i<arr.length; i++){
        if(arr[i][0] == 0){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] == 0) arr[i][j] = 1;
                else arr[i][j] = 0;
            }
        }
    }
    //IF NUMBER OF ZEROS ARE MORE THAN NUMBER OF 1 THEN FLIP THE COLUMN
    for(int j=1; j<arr[0].length; j++){
        int numOfZeros = 0, numOfOne = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i][j] == 0) numOfZeros += 1;
            else numOfOne += 1;
        } 
        if(numOfZeros > numOfOne){
            for(int i=0; i<arr.length; i++){
                if(arr[i][j] == 0) arr[i][j] = 1;
                else arr[i][j] = 0;
            }
        }
    }
    print(arr);
    int score = 0;
    int x = 1;
    for(int j=n-1; j>=0; j--){
        for(int i=0; i<m; i++){
            score += arr[i][j]*x;
        }
        x *= 2;
    }
    System.out.println("The max score of the given array is : " + score);
    }
}