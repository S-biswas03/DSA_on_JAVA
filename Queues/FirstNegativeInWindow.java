import java.util.*;
public class FirstNegativeInWindow{
    public static int[] firstNeg(int[] arr,int n, int k){
        int[] res = new int[n-k+1];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            if(arr[i]<0){
                q.add(i);
            }
        }
        for(int i=0; i<n-k+1; i++){
            if(q.size()>0 && q.peek()<i) q.remove();

            if(q.size()>0 && q.peek()<=i+k-1) res[i] = arr[q.peek()];
            else if(q.size()==0) res[i]=0;
            else res[i] = 0;
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr = {12,-1,-7,8,-15,30,16,20};
        int n = arr.length;
        int k = 3;
        int[] x = firstNeg(arr,n,k);
        for(int ele: x){
            System.out.print(ele+" ");
        }
    }
}