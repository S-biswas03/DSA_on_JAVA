import java.util.*;
public class ValidParenthesis{
    public static boolean isValid(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            if(ch=='(' || ch=='{' ||ch=='[') st.push(ch);
            else if(ch==')'){
                if(st.peek()=='(') st.pop();
            } 
            else if(ch=='}'){
                if(st.peek() == '{') st.pop();
            }
            else if(ch==']'){
                if(st.peek()=='[') st.pop();
            }
            else return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        System.out.print(isValid(str));
    }
}