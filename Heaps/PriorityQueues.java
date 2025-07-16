package Heaps;

import java.util.*;
public class PriorityQueues{
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(3);
        pq.add(9);
        pq.add(1);
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
        System.out.println();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        pq2.add(5);
        pq2.add(3);
        pq2.add(9);
        pq2.add(1);
        while(!pq2.isEmpty()){
            System.out.println(pq2.peek());
            pq2.remove();
        }
    }
}