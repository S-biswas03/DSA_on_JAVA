package LinkedList;

public class ReverseLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void print(Node head){
        System.out.print(head.data + " ");
        print(head.next);
    }

    // public static void printReverse(Node head){
    //     if(head == null) return;
    //     printReverse(head.next);
    //     System.out.print(head.data + " ");
    // }

    public static Node reverse(Node head){
        if(head.next == null) return head;  //basecase
        Node newHead = reverse(head.next);  //recursion
        head.next.next = head;              //work interchanging the connection
        head.next = null;
        return newHead;
    }
    public static void main(String[] args){
        Node a = new Node(1);
        Node b = new Node(4);
        Node c = new Node(7);
        Node d = new Node(5);
        Node e = new Node(11);
        a.next = b;
        b.next = c; 
        c.next = d;
        d.next = e;
        print(a);
        System.out.println();
        // printReverse(a);

        Node r = reverse(a);
        print(r);
    }
}
