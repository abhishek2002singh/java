

public class reverselinkedlist {
    public static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addfirst4(int data)
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
    public void reversenode()
    {
          Node prev=null;
          Node curr=head;
          Node temp;
          while(curr!=null)
          {
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
          }
          head=prev;

    }
    public void print1()
    {
        if(head==null)
        {
            System.out.print("Linked are empty");
            return;
        }
        Node temp2=head;
        while(temp2!=null)
        {
            System.out.print(temp2.data + "->");
            temp2=temp2.next;
        }
        System.out.println();
    }
    public static void main(String args[]) {
        reverselinkedlist l=new reverselinkedlist();
        l.addfirst4(1);
        l.print1();
        l.addfirst4(2);
        l.print1();
        l.addfirst4(3);
        l.print1();
        l.addfirst4(4);
        l.addfirst4(5);
        l.addfirst4(6);
        l.print1();
        System.out.println("print reverse linkedlist");
        l.reversenode();
        l.print1();
    }
}
