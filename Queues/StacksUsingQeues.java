import java.util.*;
public class StacksUsingQeues {
    public static class Stacks{
        Queue<Integer> q = new LinkedList<>();

        //PUSH EFFICIENT TC = O(n)
        public void push(int val){
            q.add(val);
        }
        public int peek(){
            int n = q.size();
            for(int i=0; i<n-1; i++){
                q.add(q.remove());
            }
            int peek = q.peek();
            q.add(q.remove());
            return peek;
        }
        public int pop(){
            int n = q.size();
            for(int i=0; i<n-1; i++){
                q.add(q.remove());
            }
            int x = q.remove();
            return x;
        }
        public boolean isEmpty(){
            if(q.size()==0) return true;
            else return false;
        }


        //POP PEEK EFFICIENT TC = O(1)
        public void push(int val){
            if(q.size()==0) q.add(val);
            else{
                q.add(val);
            for(int i=0; i<n-1; i++){
                q.add(q.remove());
            }
            }
        }
        public int pop(){
            return q.remove();
        }
        public int peek(){
            return q.peek();
        }
    }
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();

    }
}
