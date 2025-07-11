import java.util.*;
public class Permutation {
    public static void printPermutation(String s, String ans, List<String> l){
        if(s.length()==0){  //OR if(s.equals(""))
            l.add(ans);
            return;
        }
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            String left = s.substring(0,i);
            String right = s.substring(i+1);
            String rem = left+right;
            printPermutation(rem, ans+ch,l);
        }
    }
    public static void main(String[] args){
        String s = "abc";
        List<String> l = new ArrayList<>();
        printPermutation(s,"",l);
        for(int i=0; i<l.size(); i++){
            System.out.println(l.get(i));
        }
    }
}
