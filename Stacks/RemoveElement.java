import java.util.*;
public class RemoveElement{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack<Integer> temp = new Stack<>();
        System.out.println("Enter position to be removed.");
        int n = sc.nextInt();
        while(st.size()>n){
            temp.push(st.pop());
        }
        st.pop();
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);
        sc.close();
    }
}