public class LinkedListImplementation {
    public static class Node{
        int data;
        Node(int data){
            this.data = data;
        }
        Node next;
    }
    public static class Stack{
        Node head = null;
        int size = 0;

        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;          
        }
        void displayRec(Node h){
            if(h==null) return;
            displayRec(h.next);
            System.out.print(h.data + " ");
        }
        void display(){
            displayRec(head);
        }
        void displayRev(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        int peek(){
            if(head==null){
                System.out.println("Empty stack");
                return -1;
            }
            return head.data;
        }
        int pop(){
            if(head==null) System.out.println("Empty stack");
    
                int x = head.data;
                head = head.next;
                size--;
                return x;
        }
        int size(){
            return size;
        }
    }
    public static void main(String[] args){
        Stack st = new Stack();
        st.push(4);
        st.displayRev();
        st.push(5);
        st.displayRev();
        st.push(6);
        st.displayRev();
        System.out.println(st.size());
        st.pop();
        System.out.println();
        st.displayRev();
        System.out.println(st.size());
        st.push(9);
        st.push(10);
        st.push(15);
        st.push(13);
        st.displayRev() ;
        System.out.println(st.size());
        st.display();
    }
}
