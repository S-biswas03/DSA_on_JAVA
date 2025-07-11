//package BinarySearchTree;

public class InsertingInBST {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static Node insert(Node root, int val){
        if(root==null) return new Node(val);
        if(root.val < val){
            if(root.right == null){
                Node temp = new Node(val);
                root.right = temp;
            }
            else insert(root.right, val);
        }
        else{
            if(root.left == null) {
                Node temp = new Node(val);
                root.left = temp;
            }
            else insert(root.left, val);
        }
        return root;
    }
    public static void main(String[] args){

    }
}
