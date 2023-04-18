public class ispalindrom
{
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
    public void addfirst6(int data)
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
    public void print6()
    {
        if(head==null)
        {
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public Node findmidNode(Node head)
    {
        Node temp=head;
        Node temp2=head;
        while(temp2!=null&&temp2.next!=null)
        {
            temp=temp.next;
            temp2=temp2.next.next;
        }
        return temp;
    }

    public  boolean checkpalindrom()
    {
        if(head==null||head.next==null)
        {
            return true;
        }
        Node midNode=findmidNode(head);
        Node prev =null;
        Node curr=midNode;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        while(right!=null)
        {
            if(left.data!=right.data)
            {
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static void main(String args[]) {
        ispalindrom ll=new ispalindrom();
        ll.addfirst6(1);
        ll.addfirst6(5);
        ll.addfirst6(2);
        System.out.println("print linkedlist");
        ll.print6();
        if(ll.checkpalindrom())
        {
            System.out.println("palindrom");
        }
        else
        {
            System.out.println("not palindrom");
        }   
        ll.print6();
    }
}