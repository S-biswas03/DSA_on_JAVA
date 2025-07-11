import java.util.ArrayList;
import java.util.List;

public class arrayPermutationTwo{
    public static void main(String[] args){
        int[] nums = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums,0,ans);
        System.out.println(ans);
    }
    public static void helper(int[] nums, int idx, List<List<Integer>> ans){
        int n = nums.length;
        if(idx==n-1){
            List<Integer> l = new ArrayList<>();
            for(int i=0; i<n; i++){
                l.add(nums[i]);
            }
            ans.add(l);
            return;
        }
        for(int i=idx; i<n; i++){
            swap(i,idx,nums);
            helper(nums,idx+1,ans);
            swap(i,idx,nums);
        }
    }
    public static void swap(int i, int idx, int[] nums){
        int temp = nums[i];
        nums[i] = nums[idx];
        nums[idx] = temp;
    }
}