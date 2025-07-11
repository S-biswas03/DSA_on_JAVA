public static Node constructbfas(String[] arr){
    int x = Integer.parseInt(arr[0]);
    int n = arr.length;
    Node root = new Node(x);
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    int i=1;
    while(i<n-1){
        Node temp = q.remove();
        Node left = new Node(10);
        Node right = new Node(100);
        if(arr[i].equals("")) left = null;
        else{
            int l = Integer.parseInt(arr[i]);
            left.val = l;
            q.add(left);
        }
        if(arr[i+1].equals("")) right = null;
        else{
            int r = Integer.parseInt(arr[i+1]);
            right.val = r;
            q.add(right);
        }
        temp.left = left;
        temp.right = right;
        i+=2;
    }
    return root;
}