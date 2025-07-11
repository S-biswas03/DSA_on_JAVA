package LinkedList;
public class DeleteMiddleNode{
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node deleteMiddle(Node head){
        Node slow = head;
        Node fast = head;
        if(head.next == null) return null;
        //CONDITION FOR RIGHT MIDDLE(fast.next.next!=null) CONDITION FOR MIDDLE(fast.next.next!=null) CONDITION FOR LEFT MIDDLE(fast.next.next.next.next!=null)
        while(fast.next.next!=null && fast.next.next.next!=null && fast.next.next.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static void main(String[] args){

    }
}