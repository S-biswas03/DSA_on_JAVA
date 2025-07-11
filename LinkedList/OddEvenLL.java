package LinkedList;

public class OddEvenLL {
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

            // USING EXTRA SPACE
    public static Node separateNode(Node head){
        Node oddHead = new Node(-1);
        Node oddTemp = oddHead;
        Node evenHead = new Node(-1);
        Node evenTemp = evenHead;
        Node temp = head;
        while(temp != null){
            if(temp.data % 2 == 0){
                Node e = new Node(temp.data);
                evenTemp.next = e;  // linking with even node
                evenTemp = e;       // move evenTemp to e for next linking
            }
            else{
                Node o = new Node(temp.data);
                oddTemp.next = o;   // linking with odd Node 
                oddTemp = o;        // move oddTemp to o for next linking
            }
            temp = temp.next;       // move temp further to next Node
        }
        oddTemp.next = evenHead.next;   // Link odd list to head.next of even list
        evenTemp.next = null;           // terminate the even list 

        return oddHead.next;            // return oddHead.next Node 
    }

            //WITHOUT USING EXTRA SPACE
    public static Node separateOddEven(Node head){
        Node even = new Node(0);
        Node odd = new Node(1);
        Node tempe = even;
        Node tempo = odd;
        Node temp = head;
        while(temp != null){
            if(temp.data%2 == 0){
                tempe.next = temp;
                tempe = tempe.next;
                }
            else{
                tempo.next = temp;
                tempo = tempo.next;
            }
            temp = temp.next;
        }
        tempo.next = even.next;
        tempe.next = null;
        return odd.next;
    }

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args){
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
    }
}
