public class GreaterTree{
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    // public static int sum = 0;
    public static void helper(Node root,int[] sum){
        if(root==null) return;
        helper(root.right,sum);
        root.val = root.val + sum[0];
        sum[0] = root.val;
        helper(root.left,sum);
    }
    public static Node greaterTree(Node head){
        // sum = 0;
        int[] sum = new int[1];
        sum[0] = 0;
        helper(root);
        return root;
    }
    public static void main(String[] args){

    }
}