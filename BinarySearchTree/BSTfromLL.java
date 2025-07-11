public class BSTfromLL{
    public static class NodeTree{
        int val;
        NodeTree left;
        NodeTree right;
        public NodeTree(int val){
            this.val = val;
        }
    }
    public static class NodeLL{
        int val;
        NodeLL next;
        public NodeLL(int val){
            this.val = val;
        }
    }
    public static NodeTree helper(int [] nums,int lo, int hi){
        if(lo>hi) return null;
        int mid = lo+(hi-lo)/2;
        NodeTree root = new NodeTree(nums[mid]);
        root.left = helper(nums,lo,mid-1);
        root.right = helper(nums,mid+1,hi);
        return root;
    }
    public static NodeTree convert(NodeLL head){
        NodeLL temp = head;
        int n=0;
        while(temp!=null){
            n++;
            temp = temp.next;
        }
        int[] nums = new int[n];
        int i=0;
        temp = head;
        while(temp!=null){
            nums[i] = temp.val;
        }
        return helper(nums,0,n-1);
    }
    public static void main(String[] args){

    }
}