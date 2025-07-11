//package BinarySearchTree;

public class Searching {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static Node isPresent(Node root, int x){
        if(root==null) return null;
        if(root.val==x) return root;
        if(root.val > x) {
            return isPresent(root.left, x);
        }
        if(root.val < x) {
            return isPresent(root.right, x);
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

        System.out.println(isPresent(root,3));
    }
}
