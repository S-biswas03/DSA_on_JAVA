import java.util.*;
public class EvaluationPostfix {
    public static void main(String[] args){
        String str = "953+4*6/-";
        Stack<Integer> val = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int x = (int)ch;
            if(x>=48 && x<=57){
                val.push(x-48);
            }
            else{
                int v2 = val.pop();
                int v1 = val.pop();
                if(ch=='+') val.push(v1+v2);
                else if(ch=='-') val.push(v1-v2);
                else if(ch=='*') val.push(v1*v2);
                else if(ch=='/') val.push(v1/v2);
            }
        }
        System.out.println(val.peek());
    }
}
