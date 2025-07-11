package LinkedList;

public class OddEvenIdxLL{
   public static class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
   }
   public static Node oddEven(Node head){
    Node temp = head;
    Node even = new Node(0);
    Node tempe = even;
    Node odd = new Node(-1);
    Node tempo = odd;
    while(temp!=null){
        tempo.next = temp;
        temp = temp.next;
        tempo = tempo.next;
        
        tempe.next = temp;
        if(temp==null) break;
        temp = temp.next;
        tempe = tempe.next;
    }
    odd = odd.next;
    even = even.next;
    tempo.next = even;
    return odd;
   }
}
