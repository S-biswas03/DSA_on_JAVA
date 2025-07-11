package LinkedList;

public class StartofCyclicLL {
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node startNode(Node head){
        Node slow = head;
        Node fast = head;

        if(head.next==null || head==null) return null;
        
        while(fast!=null){
            if(fast.next==null) return null; 
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow) break;
        }
        Node temp = head;
        while(temp!=slow){
            temp = temp.next;
            slow = slow.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        
    }
}
