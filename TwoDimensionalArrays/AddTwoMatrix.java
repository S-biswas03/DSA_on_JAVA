// package TwoDimensionalArrays;

public class AddTwoMatrix {
    public static void main(String[] args) {
        int[][] a = {{1,2,3} , {4,5,6}};
        int[][] b = {{9,8,7} , {6,5,4}};
        int[][] c = new int[2][2];

        System.out.println("1st Array :");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("2nd Array : ");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        //USING EXTRA ARRAY.
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Sum of matrices : ");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        // WITHOUT USING EXTRA ARRAY.
        // for(int i=0; i<2; i++){
        //     for(int j=0; j<2; j++){
        //         a[i][j] += b[i][j];
        //     }
        // }
        // System.out.println("The sum of given arrays is : ");
        // for(int i=0; i<2; i++){
        //     for(int j=0; j<2; j++){
        //         System.out.print(a[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }
}
