public class LLImplementationOfQueue {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class queueLL{
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int x){ //NICHE SE ADD HOTA HAIN
            Node temp = new Node(x);
            if(size == 0){
                head = tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        public int remove(){    //UPAR SE REMOVE HOTA HAIN
            if(size == 0){
                System.out.println("Empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size --;
            return x;
        }
        public int peek(){
            if(size == 0){
                System.out.println("Empty");
                return -1;
            }
            return head.val;
        }
        public void display(){
            if(size==0){
                System.out.println("Empty");
            }
            else{
                Node temp = head;
                while(temp!=null){
                System.out.print(temp.val + " ");
                temp = temp.next;
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args){
        queueLL q1 = new queueLL();
        q1.display();
        q1.add(5);
        q1.add(4);
        q1.add(6);
        q1.add(8);
        q1.display();
        q1.remove();
        q1.display();
        System.out.println(q1.peek());
    }
}
