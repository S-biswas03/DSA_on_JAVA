import java.util.*;

public class InterleafQueue{
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);

        int n = q.size();
        System.out.println(q);

        Stack<Integer> st = new Stack<>();
        //STEP 1 1ST HALF KO STACK ME DAALO
        for(int i=1; i<=(n/2); i++){        //q.size() har iteration k baad change ho raha hain isliya pehle 8/2 fr 7/2 fr 6/2 aaraha hain
            st.push(q.remove());
        }
        
        //STEP 2 REMOVE FROM STACK AND PUSH IN QUEUE
        while(st.size()!=0){
            q.add(st.pop());
        } 
        
        //STEP 3 AGAIN PUSH 1ST HALF INTO STACK
        for(int i=1; i<=(n/2); i++){
            st.push(q.remove());
        }
        //STEP 4 STACK SE 1 ELEMENT PUSH KARO QUEUE ME AUR QUEUE K 1ST ELEMENT KO LAST ME LAGAO
        while(st.size()!=0){
            q.add(st.pop());
            q.add(q.remove());
        }
        //REVERSE QUEUE USING STACK
        while(q.size()!=0){
            st.push(q.remove());
        }
        while(st.size()!=0){
            q.add(st.pop());
        }

        System.out.println(q);

    }
}