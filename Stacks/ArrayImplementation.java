public class ArrayImplementation {
    public static class Stack{
        int[] arr = new int[5];
        int idx = 0;
        void push(int x){
            if(isFull()==true){
                System.out.println("Already full.");
                return;
            }
            arr[idx] = x;
            idx++;
        }
        int peek(){
            if(idx==0){
                System.out.println("Stack is full.");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){
                System.out.println("Empty stack.");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }
        void display(){
            for(int i=0; i<idx; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(size()==0) return true;
            return false;
        }
        boolean isFull(){
            if(size()==arr.length) return true;
            return false;
        }
    }
    public static void main(String[] args){
        Stack st = new Stack();
        st.push(4);
        st.display();
        st.push(5);
        st.display();
        st.push(6);
        st.display();
        System.out.println(st.size());
        st.pop();
        System.out.println();
        st.display();
        System.out.println(st.size());
        st.push(9);
        st.push(10);
        st.push(15);
        System.out.println(st.isFull());
        st.push(13);
    }
}
