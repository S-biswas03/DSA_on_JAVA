import java.util.*;
public class QueuesUsingStacks{
    public class Queues{
        Stack<Integer> st = new Stack<>();
        Stack<Integer> helper = new Stack<>();

            //PUSH EFFICIENT
        public void add(int val){
            st.push(val);
        }
        public int top(){
            while(st.size()>0){
                helper.push(st.pop());
            }
            int x = st.peek();
            while(helper.size()!=0){
                st.push(helper.pop());
            }
            return x;
        }
        public int remove(){
            while(st.size()>0){
                helper.push(st.peek());
            }
            int x = st.pop();
            while(helper.size()!=0){
                st.push(helper.pop());
            }
            return x;
        }

        
            //PEEK AND POP EFFICIENT
        public void push(int val){
            if(st.size() == 0) st.push(val);
            else{
                while(st.size()!=0){
                    helper.push(st.pop());
                }
                helper.push(val);
                while(helper.size()!=0){
                    st.push(helper.pop());
                }
            }
        }
        public int peek(){
            return st.peek();
        }
        public int pop(){
            return st.pop();
        }
        public boolean isEmpty(){
            if(st.size()==0) return true;
            else return false;
        }
    }
    public static void main(String[] args){

    }
}