public class InsertionDLL {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data +  " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node insertAtHead(Node head,int x){
        Node t = new Node(x);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }

            //WHWEN HEAD IS KNOWN
    public static Node insertAtTail(Node head, int x){
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;     //TEMP IS NOW AT TAIL
        }
        
        Node insert  = new Node(x);
        temp.next = insert;
        insert.prev = temp;
        temp = insert;

        return head;
    }
    public static Node insertAtIdx(Node head, int idx, int x){
        Node temp = head;
        for(int i=0; i<idx-1; i++){
            temp = temp.next;   //TEMP IDX SE PEHLE TAK AAGAYA
        }
        Node insert = new Node(x);
        // temp.next = insert;
        // insert.next = temp.next.next;        age k node lost ho jayenge ya fir temp null ko point karega;
        // insert.prev = temp;
        // temp = insert;
        // temp.next.prev = temp;
        temp.next.prev = insert;
        insert.prev = temp;
        insert.next = temp.next;
        temp.next = insert;
        return head;
    }
    public static void main(String[] args){
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
        // Node newHead = insertAtHead(a, 30);
        // display(newHead);
        // insertAtTail(a, 20);
        // display(a);
        Node newHead2 = insertAtIdx(a, 3, 25);
        
        display(newHead2);
    }
}
