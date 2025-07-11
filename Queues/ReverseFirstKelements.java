import java.util.*;
public class ReverseFirstKelements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int n = q.size();
        System.out.println("Given queue is: ");
        System.out.println(q);
        System.out.println("Enter a number: ");
        int k = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        while(q.size()>=k){
            st.push(q.remove());
        }
        while(st.size()!=0){
            q.add(st.pop());
        }
        //System.out.println(q);
        Queue<Integer> q1 = new LinkedList<>();
        while(q.size()>k){
            q1.add(q.remove());
        }
        while(q1.size()!=0){
            q.add(q1.remove());
        }

        System.out.println("Answer queue is : ");
        System.out.println(q);
    }
}
