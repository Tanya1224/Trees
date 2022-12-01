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
public class MaximumNode {
    public static void main(String[] args) {
        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.left.left=new Node(40);
    	root.left.right=new Node(50);
    	root.right.left=new Node(60);
    	root.right.right=new Node(70);
      System.out.println(maxi(root));
    }
    static int maxi(Node root){
        if(root==null) return Integer.MIN_VALUE;
        else{
            return Math.max(root.key,Math.max(maxi(root.left),maxi(root.right)));
        }
    }

}
