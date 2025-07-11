import java.util.*;
public class MinimumAbsoluteDifferencePair{
    public static void main(String[] args){
        int[] A = {4,1,8,7};
        int[] B = {2,3,6,5};
        Arrays.sort(A);
        Arrays.sort(B);
        int ans = 0;
        int abs = 0;
        for(int i=0; i<A.length; i++){
            abs = Math.abs(A[i]-B[i]);
            ans += abs;
        }

        System.out.println("Minimum Absolute Difference is: "+ ans);
    }
}