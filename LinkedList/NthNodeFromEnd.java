package LinkedList;

public class NthNodeFromEnd {
    // public static Node nthNode(Node head, int idx){
    //     int size = 0;
    //     Node temp = head;
    //     while(temp != null){
    //         size++;
    //         temp = temp.next;
    //     }
    //     int m = size - idx + 1;
    //     temp = head;
    //     for(int i=1; i<m; i++){
    //         temp = temp.next;
    //     }
    //     return temp;
    // }
    public static Node nthNode2(Node head, int idx){
        Node temp = head;
        Node fast = head;
        Node slow = head;
        for(int i=1; i<=idx; i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    public static void main(String[] args){
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(10);
        Node f = new Node(12);  
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        Node ans = nthNode2(a,3);
        System.out.println(ans.val);
    }
}
