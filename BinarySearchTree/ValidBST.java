public class ValidBST {
    static boolean flag = true;
    static Node prev = null;
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        if(prev==null) prev = root;
        else if(root.val < prev.val) flag = false;
        else prev = root;
        inorder(root.right);
    }
    public static boolean isValid(Node root){
        falg = true;
        prev = null;
        //inorder(root);
        return flag;
    }
    public static void main(String[] args){
        
    }
}
