import java.util.*;
public class CountDistinctElements {
    public static void main(String[] args){
        int []arr = {4,3,2,5,6,7,3,2,1};
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            hs.add(arr[i]);
        }
        //System.out.println(hs);
        System.out.println("The number of unique elements are :" + hs.size());
    }
}
