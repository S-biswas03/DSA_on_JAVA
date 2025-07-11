package strings;

import java.util.Scanner;

public class updateEven {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string : ");
    String s = sc.nextLine();
    String x = "";
    for(int i=0; i<s.length(); i++){
        if(i%2==0){
            x += 'a';
        }
        else x += s.charAt(i);
    }
    System.out.println(x);
    sc.close();
    }
}
