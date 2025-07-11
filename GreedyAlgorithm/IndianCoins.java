import java.util.*;
public class IndianCoins{
    public static void main(String[] args){
        int[] coins = {1,2,5,10,20,50,100,500,2000};
        int value = 135;
        int remaining = value;
        int count=0;
        //Arrays.sort(coins, Comparator.reverseOrder()); reverse me sorting 
        // fir normal loop chala sakte hain

    ArrayList<Integer> ans = new ArrayList<>();        
        for(int i=coins.length-1; i>=0; i--){
            if(coins[i]<=remaining){
                count++;
                remaining -= coins[i];
                ans.add(coins[i]);
            }
        }
        System.out.println("Minimum number of coins required is : "+ count);
        System.out.print(ans);
    }
}