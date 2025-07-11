//package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Printing {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> helper = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while (q.size()!=0) {
            int x = q.poll();
            System.out.print(x + " ");
            helper.add(x);
        }
        System.out.println();
        System.out.println(helper);
        while(helper.size()!=0){
            q.add(helper.poll());
        }
        System.out.println(q);
    }
}
