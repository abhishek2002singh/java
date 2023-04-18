import java.util.*;
public class linklist {
     public static class Node{
        Node next;
        int data;
         Node(int data)
        {
              this.data=data;
              this.next=null;
        }
     }
     static class Stack
     {
        static Node head=null;
        public static boolean isEmpty()
        {
            return head==null;
        }
        public  void push(int data)
        {
           Node newNode=new Node(data);
           if(isEmpty())
           {
               head=newNode;
               return;
           }
           newNode.next=head;
           head=newNode;
        }
        public  int pop()
        {
            if(isEmpty()){
               return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        public  int peek()
        {
         if(isEmpty())
         {
            return -1;
         }
         return head.data;
        }
     }
     public static void main(String args[]) {
         Stack st=new Stack();
         st.push(4);
         st.push(5);
         st.push(7);
         st.push(6);
         st.push(1);
         while(!st.isEmpty())
         {
            System.out.println(st.peek());
            st.pop();
         }     
     }
    
}