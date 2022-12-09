import java.util.*;
class Node{
    int key;
    Node left;
    Node right;
    Node(int k){
        key=k;
        left=right=null;
    }

}
public class MaxDiffNodeAnces {
    public static void main(String[] args) {
        Node root=new Node(15);
    	root.left=new Node(5);
    	root.left.left=new Node(3);
    	root.right=new Node(20);
    	root.right.left=new Node(18);
    	root.right.left.left=new Node(16);
    	root.right.right=new Node(80);
        
    }
    int res=Integer.MIN_VALUE;
    int maxDiff(Node root)
    {
        diff(root);
        return res;
    }
    int diff(Node root)
    {
        if(root==null){return 900000;}
        int l=diff(root.left);
        int r=diff(root.right);
        int sum=Math.max(root.key-l,root.key-r);
        res=Math.max(res,sum);
        return Math.min(root.key,Math.min(l,r));
        
        
    }
}
