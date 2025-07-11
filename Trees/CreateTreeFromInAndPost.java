public class CreateTreeFromInAndPost {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static Node helper(int[] pre, int prelo, int prehi, int[] in, int inlo, int inhi){
        if(prelo>prehi) return null;
        Node root = new Node(pre[prelo]);
        int i = inlo;
        while(in[i] != pre[prelo]) i++;
        int ls = i - inlo;
        root.left = helper(pre, prelo+1, prelo+ls, in, inlo, i-1);
        root.right = helper(pre, prelo+ls+1, prehi, in, i+1, inhi);
        return root;
    }
    public static Node buildTree(int[] pre, int[] in){
        int n = pre.length;
        return helper(pre, 0, n-1, in, 0, n-1);
        
    }
    public static void main(String[] args){

    }
}
