public class nthNodefromlast {
    public static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
        public void next(nthNodefromlast.Node reverse) {
        }
    }
    public static Node head;
    public static Node tail;
    public void addfirst5(int data)
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
     public void print5()
     {
        if(head==null)
        {
            System.out.println("LinkedList are empty");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
        System.out.println("null");
     }

     public int find(int idx)
     {
          Node temp=head;
          Node temp2=head;
          for(int i=1;i<idx;i++)
          {
            temp2=temp2.next;
            if(temp2==null)
            {
                return -1;
            }
          }
          while(temp2.next!=null)
          {
            temp2=temp2.next;
            temp=temp.next;
          }
          return temp.data;
     }
     public static Node reverse(Node head,int i) {
      Node current=head;
      Node prev=null;
      Node Next=null;
      int count=i;
      while(current!=null&&count>0)
      {
          Next=current.next;
          current.next=prev;
          prev=current;
          current=Next;
          count--;
      }
      if(Next!=null)
      {
          head.next(reverse(Next,i));
      }
      return head;
  }

     public static void main(String args[]) {
        nthNodefromlast ll=new nthNodefromlast();
        ll.addfirst5(1);
        ll.addfirst5(2);
        ll.addfirst5(3);
        ll.addfirst5(10);
        ll.addfirst5(5);
        ll.addfirst5(6);
        ll.addfirst5(7);
        ll.print5();

        System.out.println("found data in linkedlist in last");
        int founs=(int)ll.find(4);
        System.out.print(founs);System.out.println();
        ll.reverse(head, 5);
        ll.print5();
        ll.print5();
     }
}


