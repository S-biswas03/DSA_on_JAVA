import java.util.*;
public class SlidingWindiowMax {
    public static int[] maxSlidingWindow(int[] arr,int k){
        int n = arr.length;
        //window ka 1st element n-(k-1) = n-k+1
        int[] ans = new int[n-k+1];
        int z = 0;
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];
        st.push(n-1);
        nge[n-1] = n;
        for(int i=n-2; i>=0; i--){
            while(st.size()>0 && arr[i]>arr[st.peek()]) st.pop();
            if(st.size()==0) nge[i] = n;
            else nge[i] = st.peek();
            st.push(i);
        }
        int j =0;
        for(int i=0; i<n-k+1; i++){
            if(j>=i+k) j=i;
            int max = arr[j];
            while(j<i+k){
                max = arr[j];
                j = nge[j];
            }
            ans[z++] = max;
        }
        for(int ele:ans){
            System.out.print(ele + " ");
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        maxSlidingWindow(arr,k);
        
    }
}
