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
public class InsertNodeBST {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        Node root=new Node(10);
    	root.left=new Node(5);
    	root.right=new Node(15);
    	root.right.left=new Node(12);
    	root.right.right=new Node(18);
    	
    	
    	root=insert(root,x);
	    inorder(root);
    } 
    
    public static Node insert(Node root, int x){
        if(root==null)
            return new Node(x);
        else if(root.key<x)
            root.right=insert(root.right,x);
        else if(root.key>x)
            root.left=insert(root.left,x);
        return root;
    }
    
    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }    
    }
} 