import java.util.*;
public class MinStack{
    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public static MinStack{

    }

    public static void push(int val){
        if(st.size()==0){
            st.push(val);
            min.push(val);
        }
        else{
            st.push(val);
            if(min.peek()<val) min.push(min.peek());
            else min.push(val);
        }
        public static void pop(){
            st.pop();
            min.pop();
        }
        public static int top(){
            return st.peek();
        }
        public static int getMin(){
            return min.peek();
        }
    }
    public static void main(String[] args){

    }
}