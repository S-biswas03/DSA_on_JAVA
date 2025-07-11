import java.util.ArrayList;

public class InorderPredSuc {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static void inorder(Node root,ArrayList<Integer> arr){
        if(root==null) return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
    public static void main(String[] args){
        int target = 60;
        int pred ;
        int suc ;
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println(arr);
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i)==target){
                pred = arr.get(i-1);
                suc = arr.get(i+1);
            }
        }
     }
}
