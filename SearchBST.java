import java.util.*;
class Node{
    int key;
    Node left,right;
    Node(int x){
        key=x;
    }

}
public class SearchBST {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.left.left=new Node(40);
    	root.left.right=new Node(50);
    	root.right.left=new Node(60);
    	root.right.right=new Node(70);
        if(search(root,x))
    	    System.out.print("Found");
    	else
    	    System.out.print("Not Found");
    }
    public static boolean search(Node root,int x){
        if(root==null) return false;
         else if(root.key==x) return true;
         else if(root.key<x){
            return search(root.right,x);
         }
         else{
            return search(root.left,x);
         }
    }
}
