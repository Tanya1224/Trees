import java.util.*;
class Node {
    int key;
    Node left, right;
    Node(int x)
    {
        key = x;
        left = right = null;
    }
}

public class getMindiff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        Node root=new Node(15);
    	root.left=new Node(5);
    	root.left.left=new Node(3);
    	root.right=new Node(20);
    	root.right.left=new Node(18);
    	root.right.left.left=new Node(16);
    	root.right.right=new Node(80);
        getMinimumDifference(root);
    }
    int min = Integer.MAX_VALUE;
    Node lastNode = null;
    public int getMinimumDifference(Node root) {
        if(root==null) return min;
        min=getMinimumDifference(root.left);
        if(lastNode != null){
            min = Math.min(min, Math.abs(root.key - lastNode.key));
        }
        lastNode = root;
        return getMinimumDifference(root.right);
    }
}
