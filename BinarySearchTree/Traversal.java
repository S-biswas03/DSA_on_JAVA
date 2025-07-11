//package BinarySearchTree;
import java.util.*;
public class Traversal {
     public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static void preorder(Node root){
        if(root == null) return ;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root){
        if(root == null) return ;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }
    public static void inorder(Node root){
        if(root == null) return ;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
    public static Node insert(Node root, int val){
        if(root==null) return new Node(val);
        if(val < root.val){
            root.left = insert(root.left,val);
        }
        else root.right = insert(root.right,val);
        return root;
    }

    public static Node constructBST(String[] arr){
        Node root = null;
        for(String s : arr){
            if(!s.equals("")){
                int val = Integer.parseInt(s);
                root = insert(root,val);
            }
        }
        return root;
    }
    public static void main(String[] args){
        String[] arr = {"10","5","15","2","8","12","17"};
        Node root = constructBST(arr);
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        inorder(root);
    }
}
