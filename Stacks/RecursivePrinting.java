import java.util.*;
public class RecursivePrinting{
    public static void displayRev(Stack<Integer> st){
        if(st.size()==0) return;
       int top = st.pop();
       System.out.print(top + " ");
       displayRev(st);
       st.push(top);
    }
    public static void display(Stack<Integer> ans){
        if(ans.size()==0) return;
        int x = ans.pop();
        display(ans);
        System.out.print(x + " ");
        ans.push(x);
    }
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Normal printing.");
        System.out.println(st);
        System.out.println("Recursive printing in reverse.");
        displayRev(st);        //REVERSE PRINTING HOTI HAIN
        System.out.println();
        System.out.println("Recursive printing.");
        display(st);


    }
}