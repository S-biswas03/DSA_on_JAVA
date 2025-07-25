import java.util.*;
public class ItenaryTickets{
    public static String getStart(HashMap<String,String> tickets){
        HashMap<String,String> revMap = new HashMap<>();
        for(String key : tickets.keySet()){
            revMap.put(tickets.get(key),key);
        }
        for(String key: tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key;     // this key = starting point
            }
        }
        return null;
    }
    public static void main(String[] args){
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai","Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets); 
        System.out.print(start);      // sabse pehle start vala city print hoga

        for(String key : tickets.keySet()){
            System.out.print("--> " + tickets.get(start));  // start cite se uska destination city
            start = tickets.get(start);                     // aab jo destination tha vo starting city ban jayega
        }
        System.out.println();
    }
}