import java.util.*;
public class NewDeque {
    public static void main(String[] args) {
        
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(1);
        dq.addLast(4);
        System.out.println(dq);
        dq.addFirst(5);
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        dq.removeFirstOccurrence(1);
        System.out.println(dq);
        dq.removeAll(dq);
        System.out.println(dq);
    
    }
}
