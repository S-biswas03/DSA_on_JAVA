public class MinDiff {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static int minD = Integer.MAx_VALUE;
    public static Node prev = null;
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);

        if(pre!=null){ 
        int diff = Math.abs(root.val-prev.val);
        minD = Math.min(diff,minD);
        }
        prev = root;

        inorder(root,right);
    }
    public static int minimum(Node root){
        minD = Integer.MAX_VALUE;
        prev = null;
        inorder(root);
        return minD;
    }
    public static void main(String[] args){

    }
}
