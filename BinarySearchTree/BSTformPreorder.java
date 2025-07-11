public class BSTfromPreorder{
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
        if(root.val>val){
            if(root.left==null) root.left = new Node(val);
            else insert(root.left,val);
        }
        else{
            if(root.right==null) root.right = new Node(val);
            else insert(root.right, val);
        }
        return root;
    }
    public static Node bst(int[] pre){
        int n = pre.length;
        Node root = new Node(pre[0]);
        for(int i=1; i<n; i++){
            root = insert(root,pre[i]);
        }
    }
}