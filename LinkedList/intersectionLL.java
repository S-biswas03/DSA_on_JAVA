package LinkedList;

public class intersectionLL {
    public static Node intersection(Node head1, Node head2){
        int n = 0;  //SIZE OF LL 1
        int m = 0;  // SIZE OF LL 2
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp1!=null){
            n++;
            temp1 = temp1.next;
        }
        while(temp2 != null){
            m++;
            temp2 = temp2.next;
        }
        temp1 = head1;
        temp2 = head2;
        int diff = Math.abs(n-m);
        if(n>m) {
            for(int i=1; i<=diff; i++){
                temp1 = temp1.next;
            }
        }
        else{
            for(int i=0; i<diff; i++){
                temp2 = temp2.next;
            }            
        }
        while(temp1!=null || temp2!=null){
            if(temp1 == temp2){
                return temp1;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
    }
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
}
