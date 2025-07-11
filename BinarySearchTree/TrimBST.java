public class TrimBST {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static void helper(Node root, int lo, int hi){
        if(root==null) return;
        while(root.left!=null){
            if(root.left.val<lo) root.left = root.left.right;
            else if(root.left > hi) root.left = root.left.left;
            else break;
        }
        while(root.right!=null){
            if(root.right > hi) root.right = root.right.left;
            else if(root.right < lo) root.right = root.right.right;
            else break;
        }
        helper(root.left,lo,hi);
        helper(root.right, lo, hi); 
        }
    public static Node trim(Node root,int lo, int hi){
        Node parent = new Node(Integer.MAX_VALUE);
        parent.left = root;
        helper(parent,lo,hi);
        return parent.left;
    }
    public static void main(String[] args){

    }
}
