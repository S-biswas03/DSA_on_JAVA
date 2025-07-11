public class PathSum3{
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }

    public static int helper(Node root, long sum){
        if(root==null) return 0;
        int count = 0;
        if((long)root.val==sum) count++;
        return count + helper(root.left,sum-(long)root.val) + helper(root.right, sum-(long)root.val);
    }
    public static int path(Node root, int sum){
        if(root==null) return 0;
        int count = helper(root,(long)sum);
        count += helper(root.left,sum) + helper(root.right, sum);
        return count;
    }
    public static void main(String[] args){

    }
}