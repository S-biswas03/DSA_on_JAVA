import java.util.*;
public class PrintingStack{
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        System.out.println("Using normal print.");
        System.out.println(st);

                    //USING ANOTHER STACK

        // Stack<Integer> temp = new Stack<>();
        // while(st.size()>0){
        //     temp.push(st.pop());
        // }
        // System.out.println("Temporary Stack.");
        // System.out.println(temp);
        // System.out.println("Printing st with code.");
        // while(temp.size()>0){
        //     System.out.print(temp.peek() + " ");
        //     st.push(temp.pop());
        // }

                //USING ARRAYS

        int n = st.size();
        int[] arr = new int[n];
        for(int i=n-1; i>=0; i--){
            arr[i] = st.pop();
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
            st.push(arr[i]);
        }
    }
}