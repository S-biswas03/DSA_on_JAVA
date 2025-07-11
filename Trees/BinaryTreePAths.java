import java.util.*;

public class BinaryTreePAths {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static void helper(Node root,ArrayList<String> ans, String s){
        if(root==null) return;
        if(root.left==null && root.right==null){        //leaf node hain matlab print kro path ko
        s += root.val;
        ans.add(s);
        return;
        }
        helper(root.left, ans, s+root.val + "->");
        helper(root.right, ans, s+root.val + "->");
    }
    public static ArrayList<String> path(Node root){
        ArrayList<String> ans = new ArrayList<>();
        helper(root,ans,"");
        return ans;
    }
    public static void main(String[] args){
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        Node f = new Node(7);
        b.left = e;
        b.right = f;
        System.out.print(path(root));
    }
}
