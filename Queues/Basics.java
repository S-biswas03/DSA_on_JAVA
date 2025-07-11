//package Queues;
import java.util.*;
public class Basics {
    public static void main(String[] args){
        //Queue<Integer> q = new Queue() AISE NEHI HOTA HAIN QUEUE
        Queue<Integer> q = new LinkedList<>();
        System.out.println(q.isEmpty());
        q.add(1);
        System.out.println(q.isEmpty());
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.size());
        System.out.println(q);
        //remove aur poll ka kaam same hain 1st element ko hatana
        q.remove();
        System.out.println(q);
        q.poll();
        System.out.println(q);
        //peek and element same kaam kare hain top/samne vale element 
        System.out.println(q.element());
        System.out.println(q.peek());
    }
}
