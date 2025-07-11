public class FlattenMultilvlDLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        Node child;
    }
    public static Node flatten(Node head){
        Node temp = head;
            while(temp!=null){
                Node t = temp.next;
                if(temp.child!= null){                  //AGAR CHILD HAIN TO 
                    Node c = flatten(temp.child);       //RECURSION
                    temp.next = c;                      //TEMP KO C SE LINK KR DO
                    c.prev = temp;                      //C KA PREV TEMP
                        //C KO AGE BADHAO;
                        while(c.next!=null){
                            c = c.next;                 //AAB C LAST TAK AAGAYA
                        }
                        c.next = t;                     //C KO T SE LINK KR DO 
                        if(t!=null) t.prev = c;
                }
                temp.child = null;                      //CHILD KO REMOVE KRNE K LIYA
                
                temp = t;
            }
            return head; 
    }
    public static void main(String[] args){

    }
}
