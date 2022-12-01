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
public class RightViewOfBT {
    public static void main(String args[]) 
    { 
        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(50);
    	
        printrightView(root);
    } 
    
    static int maxLevel=0;
    public static void printright(Node root,int level){
        if(root==null)
            return;
        if(maxLevel<level){
            System.out.print(root.key+" ");
            maxLevel=level;
        }
        printright(root.right,level+1);
        printright(root.left,level+1);
    }
    
    public static void printrightView(Node root){
        printright(root,1);
    }
}
