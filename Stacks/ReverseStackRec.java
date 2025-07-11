import java.util.*;
public class ReverseStackRec{
    public static void pushAtBottom(int x, Stack<Integer> st){
        // Stack<Integer> temp = new Stack<>();
        // while(st.size()>0){
        //     temp.push(st.pop());
        // }
        // st.push(top);
        if(st.size()==0) {
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottom(x,st);
        st.push(top);
    }
    public static void reverse(Stack<Integer> st){
        if(st.size()==1) return;
        int top = st.pop();
        reverse(st);
        pushAtBottom(top,st);
    }
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Normal Stack : " + st);
        reverse(st);
        System.out.println(st);

    }
}