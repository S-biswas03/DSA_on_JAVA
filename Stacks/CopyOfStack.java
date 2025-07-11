import java.util.*;
public class CopyOfStack{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n;
        System.out.println("Enter number of elements : ");
        n = sc.nextInt();
        System.out.println("Enter the elements : ");
        for(int i=1; i<=n; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
                //REVESE ORDER
        Stack<Integer> gt = new Stack<>();
        while(st.size()>0){
            int x = st.peek();
            gt.push(x);
            //rt/push(st.pop());
            st.pop();
        }
        // System.out.println(rt);
        Stack<Integer> ans = new Stack<>();
        while(gt.size()>0){
            ans.push(gt.pop());
        }
        System.out.println(ans);
        sc.close();
    }
}