public class LowestCommonAncestorBST {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static Node lowestCommonAnc(Node root, Node p, Node q){
        if(p.val==root.val || q.val==root.val) return root;
        if(p.val<root.val && q.val>root.val || p.val>root.val && q.val<root.val) return root;
        else if(p.val<root.val && q.val<root.val){
            return lowestCommonAnc(root.left, p, q);
        }
        else if(p.val>root.val && q.val>root.val){
            return lowestCommonAnc(root.right, p, q);
        }
        return root;
    }
    public static void main(String[] args){

    }
}
