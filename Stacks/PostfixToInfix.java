import java.util.*;
public class PostfixToInfix {
    public static void main(String[] args){
        String post = "953+4*6/-";
        Stack<String> val = new Stack<>();
        for(int i=0; i<post.length(); i++){
            char ch = post.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(ch+"");
            }
            else{
                String v2 = val.pop();
                String v1 = val.pop();
                char op = ch;
                String t = "(" + v1 + op + v2 + ")";
                val.push(t);
            }
        }
        System.out.println(val.peek());
    }
}
