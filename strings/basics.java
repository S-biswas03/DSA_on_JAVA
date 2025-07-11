package strings;
import java.util.*;

public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] ch = {'S','u','p','r','i','t','a','m'};
        for(int i =0; i<ch.length ; i++){
            System.out.print(ch);
        }
        String str = "Supritam";
        System.out.println(str);
        System.out.print("Enter your name : ");
        
        String str1 = sc.nextLine();
        System.out.println(str1);
        sc.close();
    }
}

