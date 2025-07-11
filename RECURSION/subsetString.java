package RECURSION;

import java.util.ArrayList;

public class subsetString {
    static ArrayList<String> arr = new ArrayList<>();   //GLOBAL
    public static void subset(int i, String s, String ans){
        if(i==s.length()){
            arr.add(ans);
            return;
        }
        char ch = s.charAt(i);
        subset(i+1,s,ans+ch);
        subset(i+1,s,ans);
    }
    public static void main(String[] args) {
        String s = "abc";
        arr = new ArrayList<>();    //RESERT
        subset(0,s,"");
        System.out.println(arr);
    }
}
