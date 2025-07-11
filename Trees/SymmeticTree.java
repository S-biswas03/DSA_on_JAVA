public static class Node{
    int val;
    Node left ;
    Node right;
    public Node(int val){
        this.val = val;
    }
    public static boolean isSame(Node a, Node b){
        if(a==null && b==null) return true;
        if(a==null || b==null) return false;
        if(a.val != b.val) return false;
        return isSame(a.left,b.left) && isSame(a.right, b.right);
    }
    public static Node inverseTree(Node root){
        if(root==null) return root;
        Node l = root.left;
        Node r = root.right;
        root.left = inverseTree(r);
        root.right = inverseTree(l);
        return root;
    }
    public static boolean isSymmetric(Node root){
        if(root==null) return true;
        root.left = inverseTree(root.left);
        return isSame(root.left, root.right); 
    }
    public static void main(Sring[] args){
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
    }
}