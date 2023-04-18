public class reverse {
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
        public void addfirst7(int data)
        {
            Node newdata=new Node(data);
            if(head==null)
            {
                head=tail=newdata;
                return;
            }
            newdata.next=head;
            head=newdata;
        }
        public void print7()
        {
            if(head==null)
            {
                System.out.println("linkedlist is empty");
                return;
            }
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data + "->");
                temp=temp.next;
            }
            System.out.println();
        }

        public void reverse2()
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

        
    public static void main(String args[]) {
        reverse ll=new reverse();
        ll.addfirst7(7);
        ll.addfirst7(6);
        ll.addfirst7(5);
        ll.addfirst7(4);
        ll.addfirst7(3);
        ll.addfirst7(2);
        ll.addfirst7(1);
        ll.addfirst7(0);
        ll.print7();
        ll.reverse2();
        ll.print7();
    }
}
