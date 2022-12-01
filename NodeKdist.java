import java.util.*;

import javax.swing.text.PasswordView;
class Node{
    int key;
    Node left;
    Node right;
    Node(int k){
        key=k;
        left=right=null;
    }
}
public class NodeKdist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);
        printKdist(root, k);
    }
    public static void printKdist(Node root,int k){
        if(root==null) return;
        if(k==0){
            System.out.println(root.key+" ");
        }
        else{
            printKdist(root.left, k-1);
            printKdist(root.right, k-1);
        }
    
    }
}
