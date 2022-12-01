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

public class FloorBST {
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
        System.out.println(floor(root,x).key);
    }
    public static Node floor(Node root,int x){
        Node res=null;
        while(root!=null){
            if(root.key==x) return root;
            else if(root.key>x) root=root.left;
            else{
                res=root;
                root=root.right;
            }
        }
        return res;
    }
}
