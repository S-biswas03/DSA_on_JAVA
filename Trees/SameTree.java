public class SameTree {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
        }
    }
    public static boolean isSame(Node a, Node b){
        if(a==null && b==null) return true;         // doono null hai
        if(a==null || b==null) return false;        // 1 null hai dusra null nehi hain
        if(a.val != b.val) return false;
        return isSame(a.left, b.left) && isSame(a.right, b.right);
    }
    public static void main(String[] args){
        Node a = new Node(1);
        Node b = new Node(1);
        Node c = new Node(2);
        Node d = new Node(2);
        a.left = c;
        b.right = d;
        System.out.println(isSame(a, b));
    }
}
