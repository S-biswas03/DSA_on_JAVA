import java.util.*;
public class IterationHashSet{
    public static void main(String[] args){
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("New York");
        cities.add("Dubai");
        cities.add("Tokyo");
        Iterator it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
            //OR 
        for(String city : cities){
            System.out.println(city);
        }
    }
}