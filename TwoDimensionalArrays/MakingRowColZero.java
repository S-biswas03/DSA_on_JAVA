public class MakingRowColZero{
    public static void main(String[] args){
        int[][] arr = {{0,1,1,0},{1,3,2,1},{1,1,1,4}};
        int m = 3, n = 4;
        for(int i=0; i<3; i++){
            for(int j=0;j<4; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // int[][] helper = new int[3][3];
        // for(int i=0; i<3; i++){
        //     for(int j=0; j<3; j++){
        //         helper[i][j] = arr[i][j];
        //     }
        // }

        // for(int i=0;i<3;i++){
        //     for(int j=0; j<3; j++){
        //         if(helper[i][j] == 0){
        //             for(int k=0; k<3; k++){
        //                 arr[i][k] = 0;
        //                 arr[k][j] = 0;
        //             }
        //         }
        //     }
        // }
        // System.out.println();
        // for(int i=0; i<3; i++){
        //     for(int j=0; j<3; j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        //OPTIMIZED

        // boolean[] rows = new boolean[3];
        // boolean[] col = new boolean[4];

        // for (int i=0;i<3;i++){
        //     for(int j=0;j<4;j++){
        //         if(arr[i][j]==0){
        //             rows[i] = true;
        //             col[j] = true;
        //         }
        //     }            
        // }

        // for(int i =0;i<3;i++){
        //     for(int j=0; j<4; j++){
        //         if(rows[i] == true){
        //             arr[i][j] = 0;
        //         }
        //         if(col[j] == true){
        //             arr[i][j] = 0;
        //         }
        //     }
        // }
        // for(int i =0; i<4;i++){
        //     for(int j=0; j<4;j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        
        //FULLY OPTIMIZED
        boolean zerorow = false;
        boolean zerocol = false;
        for(int j=0; j<n; j++){
            if(arr[0][j]== 0){
                zerorow = true;
                break;
            }
        }
            for(int i=0; i<m;i++){
                if(arr[i][0]==0){
                    zerocol= true;
                    break;
                }
            }
        //traversing in sub matrix without 0th row and 0th col
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(arr[i][j]==0){
                    arr[i][0] = 0;
                    arr[0][j] = 0;  
                }
            }
        }
        //traverse in 0th row
        for(int j=1;j<n;j++){
            if(arr[0][j] == 0){     //set the entire marked column as 0 
                for(int i=1; i<m; i++){
                    arr[i][j] = 0;
                }
            }
        }
        //traverse in 0th col
        for(int i=1; i<m; i++){
            if(arr[i][0] == 0){     //set the entire marked row as 0
                for(int j = 1; j<n; j++){
                    arr[i][j] = 0;
                }
            }
        }
        if(zerorow == true){//set entire row 0
            for(int j=0; j<n; j++){
                arr[0][j] = 0;
            } 
        }
        if(zerocol == true){//set entire column 0
            for(int i=0; i<m; i++){
                arr[i][0] = 0;
            } 
        }

        System.out.println("Final matrix is : ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}