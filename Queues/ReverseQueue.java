import java.util.*;

public class ReverseQueue {
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println("Given Queue is : ");
        System.out.println(q);

        Stack<Integer> st = new Stack<>();
        while(q.size()!=0){
            st.push(q.remove());
        }
        System.out.println();

        while(st.size()!=0){
            q.add(st.pop());
        }
        System.out.println("Reversed Queue is: ");
        System.out.println(q);
    }
}
