import java.util.ArrayList;
import java.util.List;

public class arraysPermutation {
    public static void main(String[] args){
        int[] nums = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] isValid = new boolean[nums.length];
        helper(nums,ds,isValid,ans);
        System.out.println(ans);

    }
    public static void helper(int[] nums,List<Integer> ds, boolean[] isValid,List<List<Integer>> ans){
        if(ds.size()==nums.length){
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<ds.size(); i++){
                list.add(ds.get(i));
            }
            ans.add(list);
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(isValid[i] == false){    //call lagao
                ds.add(nums[i]);
                isValid[i] = true;
                helper(nums, ds, isValid, ans);
                isValid[i] = false;     // BACKTRACKING
                ds.remove(ds.size()-1);
            }
        }
    }
}
