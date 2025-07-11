package LinkedList;

public class RandomPointersLL {
    public static class Node{
        int data;
        Node next;
        Node random;
        Node(int data){
            this.data = data;
            // this.next = next;
            // this.random = random;
        }
    }
    public static Node random(Node head){
        
        Node head2 = new Node(0);
        Node temp1 = head;  //original list pointer
        Node temp2 = head2;     //pointer for new list
        //DEEP COPY
        while(temp1!=null){
            Node a = new Node(temp1.data);
            temp2.next = a;
            temp2 = temp2.next;
            temp1 = temp1.next;
        }
        head2 = head2.next;
        temp2 = head2;
        temp1 = head;

            //ALTERNATE CONNECTION
        Node temp = new Node(-1);
        while(temp1 != null){
            temp.next = temp1;
            temp1 = temp1.next;
            temp = temp.next;

            temp.next = temp2;
            temp2 = temp2.next;
            temp = temp.next;
        }
        temp1 = head;
        temp2 = head2;

            // ASSIGNING RANDOM POINTERS
        while(temp1 != null && temp2 != null){
            if(temp1.random == null) temp2.random = null;
            else temp2.random = temp1.random.next;
            temp1 = temp2.next;
            if(temp2!=null) temp2 = temp1.next;
        }
        temp1 = head;
        temp2 = head2;

            //SEPARATING THE LIST
        while(temp1!=null){
        temp1.next = temp2.next;
        temp1 = temp1.next;
        if(temp1 == null) break;
        temp2.next = temp1.next;
        if(temp2.next == null) break;
        temp2 = temp2.next;
        }
        return head2;
    }
    public static void main(String[] args){

    }
}
