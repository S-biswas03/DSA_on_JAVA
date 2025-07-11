package strings;

import java.util.*;
public class allSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){   //kyuki substring(i,j) me j = j-1 tak hota hain . isliya j<+str.length()
                System.out.println(str.substring(i,j));
            }
            System.out.println();
        }
        sc.close();
    }
}