package strings;

import java.util.Scanner;

public class countWOloop {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x = sc.nextInt();
        // String s = "" + x;
        String s = Integer.toString(x);     //builtin Function.
        System.out.println(s.length());
        sc.close();
    }
}
