package LinkedList;

public class PalindromLL{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node agla = null;
        while(curr!=null){
        agla = curr.next;
        curr.next = prev;
        prev = curr;
        curr = agla;
        }
        return prev;        
    }

    public static boolean isPalindrome(Node head){
            //MIDDLE OF LINKED LIST (LEFT MIDDLE IN CASE OF EVEN)
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

            //REVERSE THE PART AFTER THE MIDDLE
        Node temp = reverse(slow.next);
        slow.next = temp;
        Node p1 = head;  //P1 KO HEAD PE RAKO
        Node p2 = slow.next;    //P2 KO MIDDLE K NEXT PE 
        while(p1!=slow){
            if(p1.data != p2.data) return false;    //COMPARE KARO AGAR P1 P2 EQUAL NA HO TO NOT PALINDROME
            // P1 P2 EQUAL HO TO DONO KO AGE BADHAO AUR FR SE CHECK KARO
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
    public static void main(String[] args){

    }
}