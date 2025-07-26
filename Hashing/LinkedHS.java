import java.util.*;
public class LinkedHS{
    public static void main(String[] args){
        HashSet<String> hs = new HashSet<>();
        hs.add("Delhi");
        hs.add("New York");
        hs.add("Tokyo");
        hs.add("Soel");
        hs.add("Austria");

        System.out.println(hs);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("New York");
        lhs.add("Tokyo");
        lhs.add("Soel");
        lhs.add("Austria");

        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("New York");
        ts.add("Tokyo");
        ts.add("Soel");
        ts.add("Austria");

        System.out.println(ts);
    }
}