import java.util.*;
public class RemoveBrcket{
    public static int numberBracket(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();
        int size = 0;
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            if(ch == '(') st.push(ch);
            else if(ch==')'){
                if(st.isEmpty()==false && st.peek() == '('){
                 st.pop();   
                }
                else size++;
            }
        }
        return size+=st.size();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.print(numberBracket(str));
    }
}