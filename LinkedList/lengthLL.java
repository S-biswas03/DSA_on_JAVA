package LinkedList;
public class lengthLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static int length(Node head){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public static void main(String[] args){
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(2);
        Node e = new Node(12);
        //ISKE BINA LINKING NEHI HOTI
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        // int length = length(a);
        System.out.println(length(a));
    }
}
