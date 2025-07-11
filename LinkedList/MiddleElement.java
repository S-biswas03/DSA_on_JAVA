package LinkedList;

public class MiddleElement {
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node middle(Node head){
        
        Node slow = head;
        Node fast = head;
        //FOR RIGHT MIDDLE IF SIZE IS EVEN (fast!=null) AND MIDDLE IF SIZE IS ODD RESPECTIVELY
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

        
        //FOR LEFT MIDDLE IF SIZE IS EVEN (fast.next.next!=null)    IS SIZE IS ODD THEN (fast.next!=null)

        // while(fast.next!=null && fast.next.next!=null){
        //     slow = slow.next;
        //     fast = fast.next.next;
        // }
        // return slow ;
        
    }
    public static void main(String[] args) {
        
    }
}
