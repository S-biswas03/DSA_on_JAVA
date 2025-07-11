public class FlattenTree{
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node (int val){
            this.val = val;
        }
    }
    public static void flatten(Node root){
        if(root==null) return;
        if(root.left==null && root.right==null) return;
        Node l = root.left;
        Node r = root.right;
        root.left = null;
        flatten(l);
        flatten(r);
        root.right = l;
        Node temp = l;
        while(temp!=null && temp.right!=null){
            temp = temp.right;
        }
        if(temp!=null) temp.right = r;
        else root.right = r;
        return;
    }
    public static void main(String[] args){

    }
}