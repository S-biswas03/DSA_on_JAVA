package Heaps;
import java.util.*;
public class MergeKSortedLL{
    static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }

        public static Node mergeKNodes(Node[] list){
            PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(node -> node.val));
            for(Node node:list){
                if(node!=null) pq.offer(node);
            }
            Node dummy = new Node(0);
            Node tail = dummy;

            while(!pq.isEmpty()){
                Node min = pq.poll();
                tail.next = min;
                tail=tail.next;

                if(min.next!=null){
                    pq.offer(min.next);
                }
            }
            return dummy.next;
        }
    
    public static void main(String[] args){

        Node l1 = new Node(1); l1.next = new Node(4); l1.next.next = new Node(5);
        Node l2 = new Node(1); l2.next = new Node(3); l2.next.next = new Node(4);
        Node l3 = new Node(2); l3.next = new Node(6);

        Node[] list = {l1,l2,l3};

        Node merged = mergeKNodes(list);

        while(merged!=null){
            System.out.print(merged.val + " ");
            merged = merged.next;
        }
    }
}
