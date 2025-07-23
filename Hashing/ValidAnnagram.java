import java.util.*;
public class ValidAnnagram {
    public static void main(String[] args){
        String s = "keen";
        String t = "knel";
        HashMap<Character, Integer> map = new HashMap<>();
        if(s.length()!=t.length()){
            System.out.println("False");
        }else{
            for(int i=0; i<s.length(); i++){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            }
            for(int i=0; i<t.length(); i++){
                char ch = t.charAt(i);
                if(map.get(ch)!=null){
                    if(map.get(ch)==1){
                        map.remove(ch);
                    } else{
                        map.put(ch,map.get(ch)-1);
                    }
                }
            }
            System.out.println(map.isEmpty());
        }
    }
}
