import java.util.*;
public class NextGreaterElement{
    public static int[] nextGreater(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            res[i] = -1;
        }
        for(int i=n-1; i>=0; i--){
            while(st.size() > 0 && st.peek() <= arr[i]){
                st.pop();
            }
            if(st.size()!=0) res[i] = st.peek();       //AGE K ELEMENTS CHOTE HAIN TO -1
            
            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr = {1,3,2,1,8,6,3,4};
        int[] ans = nextGreater(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}