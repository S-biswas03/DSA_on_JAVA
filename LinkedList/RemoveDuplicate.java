 package LinkedList;

public class RemoveDuplicate {
public static class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public static void display(Node head){
    Node temp = head;
    while(temp!=null){
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
}

public static Node removeDupNode(Node head){
    Node temp = head;
    while(temp!=null && temp.next!=null){
        if(temp.next.data == temp.data){
            temp.next = temp.next.next;

        }
        if(temp.next==null) return head;
        if(temp.next.data!=temp.data){
            temp = temp.next;
        }
    }
    return head;
}
    public static void main(String[] args){
        Node a = new Node(5);
        Node b = new Node(5);
        Node c = new Node(9);
        Node d = new Node(9);
        Node e = new Node(16);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        removeDupNode(a);
    }
}
