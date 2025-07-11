import java.util.*;

public class FractionalKnapsack {
    public static void main(String[] args){
        int W = 50;
        int[] weight = {10,20,30};
        int[] val = {60,100,120};
        
        double[][] ratio = new double[val.length][2];
        //0th col = index 1st col = ratio

        for(int i=0; i<val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));

        int capacity = W;
        int finalValue = 0;
        for(int i=ratio.length-1; i>=0; i--){
            int idx = (int)ratio[i][0];
            if(capacity>=weight[idx]){
                finalValue += val[idx];
                capacity -= weight[idx];
            }
            else{   //fractional item
                finalValue += ratio[i][1]*capacity;
                capacity = 0;
                break;

            }
        }
        System.out.println("Final value = " + finalValue);


    }
}
