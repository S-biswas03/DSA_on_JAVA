package Heaps;
import java.util.Collections;
import java.util.PriorityQueue;
public class MinOperationToHalfSum{
    public static void main(String[] args){
        int[] arr = {1,5,8,19,3};
        int sum = 0;
        for(int ele : arr){
            sum += ele;
        }
        int targetSum = sum/2;
        int currSum = sum;
        int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
        }
        while(currSum > targetSum){
            int num = pq.remove()/2;
            currSum = currSum-num;
            pq.add(num);
            count++;
        }

        System.out.println(count);
    }
}