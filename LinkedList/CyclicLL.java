package LinkedList;
public class CyclicLL{
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static boolean cyclicLL(Node head){
        Node slow = head;
        Node fast = head;
        if(head.next==null || head==null) return false;
        while(fast!=null){
            if(slow==null) return false;
            slow = slow.next;
            if(fast.next==null) return false;
            fast = fast.next.next;
            if(fast==slow) return true;
        }
        return false;
    }
    public static void main(String[] args){

    }
}