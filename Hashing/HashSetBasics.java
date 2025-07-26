import java.util.*;
public class HashSetBasics {
    public static void main(String[] args){
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(4);
        hs.add(1);
        hs.add(2);

        System.out.println(hs);

        if(hs.contains(2)) System.out.println("Have 2");
        if(hs.contains(5)) System.out.println("Have 5");
    }
}
