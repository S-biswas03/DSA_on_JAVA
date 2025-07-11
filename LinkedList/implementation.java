package LinkedList;

public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;
        int size = 0;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head==null){
                head = temp;
                tail = temp;
            }
            else{
                temp.next = head;
                head = temp;
            }
            size++;
        }
        void insertAt(int idx, int val){
            Node x = new Node(val);
            Node temp = head;
            if(idx==size){
                insertAtEnd(val);
                return;
            }
            else if(idx==0){
                insertAtHead(val);
                return;
            }
            else if(idx<0 || idx>size){
                System.out.println("Wrong input.");
                return;
            }
            for(int i=1; i<=idx-1; i++){
                temp = temp.next;
            }
            x.next = temp.next;
            temp.next = x;
            size++;
        }
        int getAt(int idx){
            if(idx<0 || idx>size){
                System.out.println("Wrong input.");
                return -1;
            }
            Node temp = head;
            for(int i=0; i<=idx; i++){
                temp.next = temp;
            }
            return temp.data;
        }
        void deleteAt(int idx){
            if(idx==0){
                head = head.next;
                size--;
                return;
            }
            Node temp = head;
            for(int i=1; i<=idx-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(idx==size-1) tail=temp;
            
            size--;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        // int size(){
        //     Node temp = head;
        //     int count = 0;
        //     while(temp!=null){
        //         count ++;
        //         temp = temp.next;
        //     }
        //     return count;
        // }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        ll.display();
        ll.insertAtEnd(5);
        ll.display();
        ll.insertAtEnd(12);
        ll.display();
        ll.insertAtHead(2);
        ll.display();
        ll.insertAt(2, 9);
        ll.display();
        ll.insertAt(4, 22);
        ll.display();
        System.out.print(ll.tail.data);
        System.out.println();
        ll.deleteAt(5);
        ll.display();
    }
}
 