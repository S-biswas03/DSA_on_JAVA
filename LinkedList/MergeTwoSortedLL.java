package LinkedList;
public class MergeTwoSortedLL{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
            // USING EXTRA SPACE

    // public static Node mergeLL(Node head1, Node head2){
    //     Node temp1 = head1;
    //     Node temp2 = head2;
    //     Node head = new Node(100);
    //     Node temp = head;
    //     while(temp1 != null && temp2 != null){
    //         if(temp1.data < temp2.data){
    //             Node a = new Node(temp1.data);
    //             temp.next = a;
    //             temp = a;
    //             temp1 = temp1.next;
    //         }
    //         else{
    //             Node a = new Node(temp2.data);
    //             temp.next = a;
    //             temp = a;
    //             temp2 = temp2.next;
    //         }
    //     }
    //     if(temp1 == null){
    //         temp.next = temp2;
    //     }
    //     else temp.next = temp1;

    //     return head.next;
    // }

            // WITHOUT USING EXTRA SPACE
public static Node mergeLL(Node head1, Node head2){
    Node temp1 = head1;
    Node temp2 = head2;
    Node h = new Node(100);
    Node temp = h;
    while(temp1 != null && temp2 != null){
        if(temp1.data < temp2.data){
            temp.next = temp1;
            temp = temp1;
            temp1 = temp1.next;
        }
        else{
            temp.next = temp2;
            temp = temp2;
            temp2 = temp2.next;
        }
    }
    if(temp1 == null){
        temp.next = temp2;
    }
    else temp.next = temp1;

    return h.next;
}
public static void main(String[] args){

}
}