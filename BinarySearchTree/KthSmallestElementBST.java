public class KthSmallestElementBST{
    static Node temp = null;
    static int count = 0;
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static Node element(Node root,int k){
        if(root==null) return null;
        element(root.left,k);
        count++;
        if(count==k){
            temp = root;
            return temp;
        }
        element(root.right,k);
        return temp;
    }
    public static void main(String[] args){
        Node root = new Node(4);
        Node a = new Node(2);
        Node b = new Node(6);
        root.left = a;
        root.right = b;
        Node c = new Node(1);
        Node d = new Node(3);
        a.left = c;
        a.right =d;
        Node e = new Node(5);
        Node f = new Node(7);
        b.left = e;
        b.right = f;

        int k = 4;
        Node res = element(root,k);
        System.out.println(res.val);
    }
}