package LinkedList;

public class basicsll {
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static class Node{
        int data;
        Node next;  //ADDRESS OF THE NEXT ELEMENT
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args){
        Node a = new Node(5);
        System.out.println(a);  //$Node@372f7a8d
        System.out.println(a.data); //5
        System.out.println(a.next); //null ABHI TAK LINK NEHI KIYA NEXT NODE

        Node b = new Node(3);
        a.next = b; //LINKING b WITH a
        System.out.println(b);  //$Node@372f7a8d
        System.out.println(b.data); //3
        System.out.println(a.next); //$Node@372f7a8d LINK KARNE K BAAD b K ADDRESS KO PRINT KRTA HAIN
        System.out.println(a.next.data);    //3

        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        b.next = c;
        c.next = d;
        d.next = e;

        // System.out.println("Printing with for loop");
        
        Node temp = a;  //temp points to a
        // for(int i=0; i<5; i++){
        //     System.out.print(temp.data + " ");
        //     temp = temp.next;   // aab temp b ko karega fr c ko and like this jab tak loop chalega
        // }
        System.out.println();
        System.out.println("Printing with while loop");
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Printing by function calling.");
        display(a);
    }
}
