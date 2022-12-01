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
public class LeftViewOfBt {
    public static void main(String args[]) 
    { 
        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(50);
    	
        printLeftView(root);
    } 
    
    static int maxLevel=0;
    public static void printLeft(Node root,int level){
        if(root==null)
            return;
        if(maxLevel<level){
            System.out.print(root.key+" ");
            maxLevel=level;
        }
        printLeft(root.left,level+1);
        printLeft(root.right,level+1);
    }
    
    public static void printLeftView(Node root){
        printLeft(root,1);
    }
}