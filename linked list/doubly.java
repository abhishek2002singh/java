public class doubly {
    public static class Node
    {
        int data;
        Node next;
        Node prev;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static Node prev;
    public void addfirst3(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
              head=tail=prev=newNode;
              return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    public void addlast3(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=prev=newNode;
            return;
        }
        Node temp=head;
    //     tail.next=newNode;
    //     newNode.prev=tail;
    //    // newNode.next=tail;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
    }

    public void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data +"<->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public  int removefirst3()
    {
        if(head==null)
        {
            System.out.print("linkedlist arre empty");
            return Integer.MIN_VALUE;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        return val;

    }

    public int removelast3()
    {
        if(head==null)
        {
            System.out.print("linkedlist are empty");
            return Integer.MIN_VALUE;
        }
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        int val=temp.data;
        temp.next=null;
        return val;
    }

    public void addmiddle3(int data,int idx)
    {
        Node newNode=new Node(data);
            int i=0;
            Node temp=head;
            Node temp2=head.next;
            while(i<idx-1)
            {
                temp=temp2;
                temp2=temp2.next;
                i++;
            }
            temp.next=newNode;
            newNode.prev=temp;
            newNode.next=temp2;
            temp2.prev=newNode;

    }

    public int removeinterval(int idx)
    {
        Node temp=head;
        Node temp2=head.next;
        int i=0;
        while(i<idx-1)
        {
             temp=temp2;
             temp2=temp2.next;
             i++;
        }
        int val=temp2.data;
        Node temp3=temp2.next;
        temp.next=temp3;
        temp3.prev=temp;
        return val;
    }

    public boolean searchNode(int data)
    {
        if(head.data==data)
        {
            return true;
        }
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==data)
            {
                return true;
            }

            temp=temp.next;
        }
        return false;
    }


    public static void main(String args[]) {
        doubly ll=new doubly ();
        ll.addfirst3(1);
        ll.addfirst3(2);
        ll.addfirst3(3);
        ll.addfirst3(4);
        ll.print();

        System.out.println("add last");
        ll.addlast3(5);
        ll.print();
        ll.addlast3(6);
        ll.print();

        System.out.println("add middle number");
        ll.addmiddle3(8, 3);
        ll.print();

        System.out.println("remove middle element");
        ll.removeinterval(3);
        ll.print();

        System.out.println("remove first");
        ll.removefirst3();
        ll.print();
        
        System.out.println("remove last");
        ll.removelast3();
        ll.print();
        System.out.println("LinkedList ");


        System.out.println("search element in linkedlist");

        if(ll.searchNode(5))
        {
            System.out.println("element is found");
        }
        else{
            System.out.println("Linked is not found");
        }
    }
}
