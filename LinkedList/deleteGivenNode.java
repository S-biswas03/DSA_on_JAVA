package LinkedList;

public class deleteGivenNode {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    void delete(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }
    //NOT VALID IF WE HAVE TO REMOVE LAST ELEMENT FROM LINKEDLIST
    public static void main(String[] args){

    }
}
