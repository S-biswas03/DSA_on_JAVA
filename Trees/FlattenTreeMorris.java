public class FlattenTreeMorris {
    public class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static void fatten(Node root){
        Node c = root;
        while(c!=null){
            if(c.left!=null){
                Node pre = c.left;
                while(pre.right!=null){
                    pre = pre.right;
                }
                pre.right = c.right;
                c.right = c.left;
                c.left = null;
            }
            c = c.right;
        }
    }
    public static void main(String[] args){
        
    }
}
