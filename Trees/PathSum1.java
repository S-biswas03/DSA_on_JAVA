public class PathSum1{
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static boolean isSum(Node root, int sum){
        if(root==null) return false;
        if(root!=null && root.left==null && root.right==null){
            if(root.val == sum) return true;
        }
        return isSum(root.left,sum-root.val) || isSum(root.right, sum-root.val);
    }
    public static void main(String[] args){

    }
}