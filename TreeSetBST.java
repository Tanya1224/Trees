import java.util.*;
public class TreeSetBST {
    public static void main(String[] args) {
        
        TreeSet<String> s = new TreeSet<String>();

        // Elements are added using add() method
        s.add("tanya");
        s.add("gupta");
        s.add("cse");
        
        // Displaying the TreeSet
        // in sorted order
        System.out.println(s);
        
        // Checking whether "ide" is present 
        // or not
        System.out.println(s.contains("gupta"));
        
        // Iterator to traverse the TreeSet
        Iterator<String> i = s.iterator();
        while(i.hasNext())
            System.out.println(i.next());
    }
    }
  

