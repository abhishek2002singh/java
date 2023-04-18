public class circular {
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
    public void addfirst8(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public static  void print8()
    {
        if(head==null)
        {
            System.out.println("linkedlist are empty");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data +"->");
            temp=temp.next;
            if(temp==head)
            {
                return;
            }
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        head=new Node(4);
        head.next=new Node(5);
        head.next.next=new Node(6);
        head.next.next.next=new Node(7);
        head.next.next.next.next=new Node(8);
        head.next.next.next.next.next=new Node(9);
        head.next.next.next.next.next.next=new Node(1);
        head.next.next.next.next.next.next.next=head;
        print8();
    }
}
