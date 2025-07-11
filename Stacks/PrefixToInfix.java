import java.util.*;
public class PrefixToInfix {
    public static void main(String[] args){
        String pre = "-9/*+5346";
        Stack<String> val = new Stack<>();
        for(int i=pre.length()-1; i>=0; i--){
            char ch = pre.charAt(i);
            int x = (int)ch;
            if(x>=48 && x<=57){
                val.push(ch+"");
            }
            else{
                String v1 = val.pop();
                String v2 = val.pop();
                char op = ch;
                String t = "(" + v1 + op + v2 + ")";
                val.push(t);
            }
        }
        System.out.println(val.peek());
    }    
}
