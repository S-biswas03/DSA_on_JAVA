import java.util.*;
public class LowestCommonAncestor{      //do given nodes just uper jisse aaye hain vo hain LCA
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static boolean contains(Node root, Node x){
        if(root==null) return false;
        if(root==x) return true;
        return contains(root.left,x) || contains(root.right,x);
    }
    public static Node lowestCA(Node root,Node a, Node b){
        if(a==root || b==root) return root;
        if(a==b) return a;
        boolean left = contains(root.left,a);
        boolean right = contains(root.right,b);
        if((left && right) || (!left && !right)) return root;   //dono alag side pe hain
        if(left && !right) lowestCA(root.left,a,b);
        if(!left && right) lowestCA(root.right,a,b);
        return root;
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
        lowestCA(root, a, b);
        //System.out.println(lowestCA(root, c, d));;
    }
}