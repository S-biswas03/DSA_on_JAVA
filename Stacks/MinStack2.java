import java.util.Stack;
public class MinStack2 {
    Stack<long> st = new Stack<>();
    int min = -1;
    // public static void minimum{
        
    // }
    public static void push(int val){
        long x = (long)val;
        if(st.size()==0){
            st.push(x);
            min = x;
        }
        else if(x>=min){
            st.push(x);
        }
        else if(x<min){
            st.push(2*x-min); 
            min = x ;
        }
    }
    public static void pop(){
        if(st.size()==0) return;
        else if(st.peek()>=min) st.pop();
        else if(st.peek()<min){      //farzi value hain
            //restore old minium
            long old = 2*min-st.peek();
            min = old;
            st.pop();
        }
    }
    public static int top(){
        if(st.size()==0) return -1;
        long q = st.peek();
        if(q>=min) return (int)qd;
        if(q<min) return (int)min;
    }
    public static int getMin(){
        if(st.size() == 0) return -1;
        return (int)min;
    }
    public static void main(String[] args){

    }
}
