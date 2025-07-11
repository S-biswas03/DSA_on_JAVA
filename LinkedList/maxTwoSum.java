package LinkedList;

public class maxTwoSum {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
        public static Node reverse(Node head){
            Node curr = head;
            Node prev = null;
            Node agla = null;
            while(curr!=null){
                agla = curr.next;
                curr.next = prev;
                prev = curr;
                curr = agla;
            }
            return prev;
        }

        public static int maxSum(Node head){
            Node slow = head;
            Node fast = head;
            while(fast.next!=null && fast.next.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            
            slow.next = reverse(slow.next);
            Node temp1 = head;
            Node temp2 = slow.next;
            int maxSum = 0;
            int sum = 0;
            while(temp2!=null){
                sum = temp1.data + temp2.data;
                if(maxSum<sum){
                    maxSum = sum;
                    temp1 = temp1.next;
                    temp2 = temp2.next;
                }
            }
            return maxSum;
        }
    }
}
