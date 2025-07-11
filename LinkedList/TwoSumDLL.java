public class TwoSumDLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
        } 
    }
    public static int maxSum(Node head){
        Node temp = head;
        Node h = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        Node t = temp;
        int sum = 0;
        int maxSum = 0;
        while(h!=t){
            sum = h.data + t.data;
            if(maxSum < sum) maxSum = sum;
            h = h.next;
            t = t.prev;
        }
        return maxSum;
    }
    public static void main(String[] args){

    }
}
