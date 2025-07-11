//package BinarySearchTree;

public class Deletion0child {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static void preoder(Node root){
        if(root==null) return;
        System.out.print(root.val + " ");
        preoder(root.left);
        preoder(root.right);
    }
    public static Node delete(Node root, int val){
        if(root==null) return null;
        if(root.val > val){
            if(root.left.val == val){
                root.left = null;
            }
            else delete(root.left, val);
        }
        if(root.val < val){
            if(root.right.val == val){
                root.right = null;
            }
            else delete(root.right, val);
        }
        return root;
    }
    public static void main(String[] args){
        Node root = new Node(50);
        Node a = new Node(20);
        Node b = new Node(60);
        root.left = a;
        root.right = b;
        Node c = new Node(17);
        Node d = new Node(34);
        a.left = c;
        a.right = d;
        Node e = new Node(55);
        Node f = new Node(89);
        b.left = e;
        b.right = f;
        Node h = new Node(10);
        Node i = new Node(28);
        c.left = h;
        d.left = i;
        Node j = new Node(70);
        f.left = j;

        preoder(root);
        System.out.println();
        delete(root, 10);
        System.out.println();
        preoder(root);
    }
}
