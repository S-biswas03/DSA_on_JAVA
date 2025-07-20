package Heaps;
import java.util.*;
public class KthLargestElement{

    public static void main(String[] args){
        int[] arr = {10,20,11,70,50,40,100,55,92,101,125,130}; //10 11 20 40 50 55 70 92 100 101
        int k = 3;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int[] ans = new int[arr.length];

        for(int i=0; i<(arr.length); i++){
            pq.add(arr[i]);
            if(pq.size()>=k){
                ans[i] = pq.remove();
            }
            else ans[i] = -1;
        }

        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}