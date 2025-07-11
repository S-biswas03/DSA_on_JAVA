package RECURSION;
import java.util.ArrayList;
import java.util.Scanner;

public class increasingNk {
    public static void printIncreasing(int n ,int k, int start, ArrayList<Integer> sequence){
        if(sequence.size() == k){
            System.out.println(sequence);
            return;
        }
        for(int i= start; i<=n; i++){
            ArrayList<Integer> newSequence = new ArrayList<>(sequence);
            newSequence.add(i);
            printIncreasing(n, k, i+1, newSequence);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter k: ");
        int k = sc.nextInt();
        printIncreasing(n,k,1,new ArrayList<>());
        sc.close();
    }
    
}
