public class TwoBST{
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static void merge(List<Integer> a, List<Integer> b, List<Integer> ans){
        int i=0, j=0;
        while(i<a.size() && j<b.size()){
            if(a.get(i)<=b.get(j)){
                ans.add(a.get(i));
                i++;
            }
            else{
                ans.add(b.get(j));
                j++;
            }
        }
        if(i==a.size()){
            while(j<b.size()){
                ans.add(b.get(j)); 
                j++;
            }
        }
        if(j==b.size()){
            while(i<a.size()){
                ans.add(a.get(i));
                i++;
            }
        }
    }
    public static List<Integer> allElements(Node root1, Node root2){
        List<Integer> a = new ArrayList<>();
        Node curr1 = root1;
        while(curr1!=null){
            if(curr1.left!=null){
                Node pred = curr1.left;
                while(pred.right!=null && pred.right!=curr1){
                    pred = pred.right;
                }
                if(pred.right==null){
                    pred.right = root1;
                    curr1 = curr1.left;
                }
                if(pred.right==curr1){
                    pred.right = null;
                    a.add(curr1.val);
                    curr1 = curr1.right;
                }
            }
            else{
                a.add(curr1.val);
                curr1 = curr1.right;
            }
        }
        List<Integer> b = new LinkedList<>();
        curr = root2;
        while(curr!=null){
            if(curr.left!=null){
                pred = curr.left;
                while(pred.right!=null){
                    pred = pred.right;
                }
                if(pred.right==null){
                    pred.right = root2;
                    curr = curr.left;
                }
                if(pred.right==curr){
                    pred.right = null;
                    b.add(curr.val);
                    curr = curr.right;
                }
            }
            else{
                b.add(curr.val);
                curr = curr.right ;
            }
        }
        List<Integer> ans = new ArrayList<>();
        merge(a,b,ans);
        return ans;
    }
    public static void main(String[] args){

    }
}