public class PathSum2 {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static void helper(List<List<Integer>> ans,List<Integer> arr , Node root, int sum){
        if(root==null) return;
        if(root.left!=null && root.right!=null){
            arr.add(root.val)
            if(root.val = sum){
                List<Integer> a = new ArrayList<>();
                for(int i=0; i<a.size(); i++){
                    a.add(arr.get(i));
                }
                ans.add(a);
                
            }
            arr.remove(arr.size()-1);   //BACKTRACKING
            return;
        }
        arr.add(root.val);
        helper(ans, arr, root.left, sum-root.val);
        helper(ans, arr, root.right, sum-root.val);
        arr.remove(arr.size()-1);       //BACKTRACKING
    }
    public static List<List<Integer>> isSum(Node root, int sum){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        helper(ans,arr,root,sum);
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
