import java.util.*;
public class BalanceHeight {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static int height(Node root){
        if(root==null || (root.left==null && root.right==null)) return 0;
        return 1 + Math.max(height(root.left) , height(root.right));
    }
    public static boolean isBalanced(Node root){
        if(root==null) return true;
        int leftHeight = height(root.left);
        if(root.left!=null) leftHeight++;
        int rightHeight = height(root.right);
        if(root.right!=null) rightHeight++;
        int diff = Math.abs(leftHeight-rightHeight);

        if(diff>1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    public static void main(String[] args){
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        Node f = new Node(7);
        b.left = e;
        b.right = f;
        Node x = new Node(8);
        e.left = x;
        Node z = new Node(10);
        x.left = z;
        
        System.out.println(isBalanced(root));
    }
}
