//package linked list;

public class LinkedList {
    
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addfirst1(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addlast(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
   // Node temp=head;
    //print(temp.data);
    public void print() {
        if(head==null)
        {
            System.out.println("lenked list are empty");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public int removefirst3() {
        if(head==tail)
        {
            int val=head.data;
            head=tail=null;
            return val;
        }
      
        int val=head.data;
        head=head.next;
        return val;
    }
    public  int removelast3() {
        if(head==tail)
        {
            int val=head.data;
            head=tail=null;
            return val;
        }
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        int val=temp.next.data;
        temp.next=null;
        return val;
       
    }

   
    
    public static void main(String args[]) {
        LinkedList ll=new LinkedList();
        ll.print();
        ll.addfirst1(2);
        ll.print();
        ll.addfirst1(1);
        ll.print();
        ll.addlast(3);
        ll.print();
        ll.addlast(4);
        ll.print();
        ll.removefirst3();
        ll.print();
        ll.removelast3();
        ll.print();
       
        
    }
}


