import java.util.*;
public class Treemaps{
    public static void main(String[] args){
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 50);
        tm.put("US", 20);

        System.out.println(tm);
    }
}