import java.util.*;
public class InsertionInStack{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("Enter size of Stack : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements : ");
        for(int i=1; i<=n; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        Stack<Integer> gt = new Stack<>();
        System.out.println("Enter position of adding element : ");
        int idx = sc.nextInt();
        while(st.size()>idx-1){
            gt.push(st.pop());
        }
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        st.push(num);
        while(gt.size()>0){
            st.push(gt.pop());
        }
        System.out.println(st);
        sc.close();
    }
}