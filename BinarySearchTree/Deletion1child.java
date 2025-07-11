//package BinarySearchTree;

public class Deletion1child {
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
    public static void delete(Node root, int val){
        if(root==null) return;
        if(root.val > val){
            if(root.left==null) return;
            if(root.left.val==val) {
                Node l = root.left;
                if(l.left==null && l.right==null) root.left = null;     // zero child
                //ONE CHILD
                else if(l.left==null || l.right==null){
                    if(l.left!=null) root.left = l.left;
                    else root.left = l.right;
                }
                //TWO CHILD
                else{
                    Node curr = l;
                    Node pre = curr.left;
                    while(pre.right!=null){
                        pre = pre.right;
                    }
                    delete(root,pre.val);
                    pre.left = curr.left;
                    pre.right = curr.right;
                    root.left = pre;
                }
            }
            else delete(root.left, val);
        }
        else{
            if(root.right==null) return;
            if(root.right.val==val){
                Node r = root.right;
                if(r.left==null && r.right==null) root.right = null;      // zero child
                //ONE CHILD
                else if(r.left==null || r.right==null){
                    if(r.left!=null) root.right = r.left;
                    else root.right = r.right;
                }
                //TWO CHILD
                else{
                    Node curr = r;
                    Node pre = curr.left;
                    while(pre.right!=null){
                        pre = pre.right;
                    }
                    delete(root,pre.val);
                    pre.left = curr.left;
                    pre.right = curr.right;
                    root.right = pre;
                }
            }
            else delete(root.right, val);
            
        }
    }
    public static void main(String[] args){
        Node temp = new Node(Integer.MAX_VALUE);
        temp.left = root;
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
        delete(temp , 89);
        //return temp.left;
        preoder(root);
    }
}
