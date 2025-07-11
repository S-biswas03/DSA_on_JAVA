// package Stacks;
import java.util.*;
public class basics{
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        System.out.println("Size is " + st.size());
        System.out.println(st);
        st.push(5);
        st.push(19);
        st.push(33);
        st.push(59);
        st.push(68);
        System.out.println("Size is " + st.size());
        System.out.println(st);
        System.out.println(st.peek());
        st.pop();
        System.out.println("Size is " + st.size());
        System.out.println(st);
    }
}