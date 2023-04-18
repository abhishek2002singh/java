import java.util.*;
import java.util.LinkedList;



public class kthlinkedlistreverse {
    
  

    public static void main(String args[]) {
       LinkedList<Integer>ll=new LinkedList<>() ;
       ll.addFirst(5);
       ll.addFirst(6);
       ll.addFirst(7);
       ll.addFirst(9);
       ll.addFirst(2);
       ll.addFirst(1);
       ll.addFirst(3);
       ll.addFirst(4);
       System.out.print(ll);
      // ll.reverse(ll.addFirst(5),2);
      System.out.println();
      System.out.println("reverse linkedList");
      Collections.reverse(ll);
      System.out.print(ll);
    }
}
