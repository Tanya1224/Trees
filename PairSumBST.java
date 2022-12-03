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
public class PairSumBST {
    
    public static boolean ispairsum(Node root,int sum,HashSet<Integer>s){
        if(root==null) return false;
        if(ispairsum(root.left, sum, s)==true)
        return true;
        if(s.contains(sum-root.key))
        return true;
        else{
            s.add(root.key);
            return ispairsum(root.right, sum, s);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=sc.nextInt();
        Node root = new Node(10);  
        root.left = new Node(8);  
        root.right = new Node(20);  
        root.left.left = new Node(4);
        root.left.right = new Node(9);
        root.right.left = new Node(11);
        root.right.right = new Node(30);  
        root.right.right.left = new Node(25);
        HashSet<Integer>s= new HashSet<>();
        System.out.println(ispairsum(root, sum, s));
    }
}
