import java.util.ArrayList;

public class RecoverBST {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static void recoverTree(Node root){
        Node curr = root;
        Node prev = null;
        Node prevPrev = null;
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
                    if(prev!=null && prevPrev!=null){
                        if(prev.val > curr.val && prev.val > prevPrev.val){
                            arr.addd(prev);
                        }
                        if(prev.val < prevPrev.val && prev.val < curr.val) arr.add(prev.val);                    
                    }
                    else if(prev!=null){
                        if(prev.val>curr.val) arr.add(prev);

                    }
                    prevPrev = prev;
                    prev = curr;
                    curr = curr.right;
                }
            }
            else{
                if(prev!=null && prevPrev!=null){
                        if(prev.val > curr.val && prev.val > prevPrev.val){
                            arr.addd(prev);
                        }
                        if(prev.val < prevPrev.val && prev.val < curr.val) arr.add(prev.val);                    
                    }
                    else if(prev!=null && prev.val>curr.val) arr.add(prev); 
                prevPrev = prev;
                prev = curr;
                curr = curr.right;
            }

        }
        if(prev.val< prevPrev.val) arr.add(prev);
        Node first = arr.get(0);
        Node second = arr.get(arr.size()-1);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
    public static void main(String[] args){

    }
}
