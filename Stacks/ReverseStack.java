import java.util.*;
public class ReverseStack{
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Normal Stack printing.");
        System.out.println(st);

        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        System.out.println("Step 1: " + rt);
        
        Stack<Integer> qt = new Stack<>();
        while(rt.size()>0){
            qt.push(rt.pop());
        }
        System.out.println("Step 2: " + qt);

        System.out.println("Reversed Stack: ");
        while(qt.size()>0){
            st.push(qt.pop());
        }
        System.out.println(st);
    }
}