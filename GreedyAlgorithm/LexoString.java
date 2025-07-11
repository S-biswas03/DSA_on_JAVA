import java.util.*;
public class LexoString{
    public static void main(String[] args){
    int n = 3, k=25;
    char[] ch = new char[n];
    for(int i=n-1; i>=0; i--){
        if(k>0){
            int charVal = Math.min(k-i,26);
            ch[i] = (char)('a'+charVal-1);
            k-=charVal;
        }
        else{
            ch[i] = 'a';
        }
        
    }
    System.out.println(ch);
    }
}