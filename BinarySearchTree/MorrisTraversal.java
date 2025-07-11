public class MorrisTraversal{
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static List<Integer> inorder(Node root){
        Node curr = root;
        List<Integer> arr = new ArrayList<>();
        while(curr!=null){
            if(curr.left!=null){
                Node pred = curr.left;
                while(pred.right!=null && pred.right!=curr){
                    pred = pred.right;
                }
                if(pred.right==null){
                    pred.right = curr;
                    curr = curr.left;
                }
                if(pred.right==curr){
                    pred.right = null;
                    arr.add(curr.val);
                    curr = curr.right;
                }
            }
            else{
                arr.add(curr.val);
                curr = curr.right;
            }
        }
        return arr;
    }
    public static void main(String[] args){

    }
}