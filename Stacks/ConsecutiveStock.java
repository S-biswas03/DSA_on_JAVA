import java.util.*;
public class ConsecutiveStock{
    public static int[] consecutive(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];
        res[0] = 1;
        st.push(0);
        for(int i=1; i<res.length; i++){
            while(arr[i] > arr[st.peek()] && st.size()>0){
                st.pop();
            }
            if(st.size()!=0) res[i] = i - st.peek();
            st.push(i);
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr = {100,80,60,70,60,75,85};
        int[] ans = consecutive(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}