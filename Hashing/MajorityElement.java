import java.util.*;
public class MajorityElement {      //TC = O(n)
    public static void main(String[] args){
        int arr[] = {1,3,2,5,1,3,1,5,1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
            // if(map.containsKey(arr[i])){
            //     map.put(arr[i], map.get(arr[i])+1);
            // } else{
            //     map.put(arr[i], 1);
            // }
        }
        //Set<Integer> keySet = map.keySet();
        for(Integer k : map.keySet()){
            if(map.get(k)>arr.length/3){
                System.out.println(k + " occuring " + map.get(k) + " times.");
            }
        }
    }
}
