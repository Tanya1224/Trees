import java.util.*;
class Node {
    int key;
    Node left, right;
    Node(int item)
    {
        key = item;
        left = right = null;
    }
}
public class Symmetric {
    Node root;
 static boolean isSymmetric(Node root)
    {
        return isMirror(root, root);
    }
 static boolean isMirror(Node node1,Node node2){
    if (node1 == null && node2 == null)
    return true;
if (node1 != null && node2 != null
    && node1.key == node2.key)
    return (isMirror(node1.left, node2.right)
            && isMirror(node1.right, node2.left));
return false;
}
    public static void main(String[] args) {
        Symmetric tree= new Symmetric();
        Node root = new Node(1);  
        root.left = new Node(2);  
        root.right = new Node(2);  
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);
        root.right.right = new Node(3);
        boolean op=tree.isSymmetric(root);
        if(op==true) System.out.println("Symmetric");
        else
        System.out.println("Not");
        
    }
}
