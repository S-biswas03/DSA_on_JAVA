public class BSTfromArray {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static Node createBst(int[] arr,int lo, int hi){
        if(lo>hi) return null;
        int mid = lo+(hi-lo)/2;
        Node root = new Node(arr[mid]);
        root.left = createBst(arr,lo,mid-1);
        root.right = createBst(arr,mid+1,hi);
        return root;
    }
    public static void main(String[] args){
        int[] arr = ;
        int lo = 0;
        int hi = arr.length-1;
        createBst(arr,lo,hi);
    }
}
