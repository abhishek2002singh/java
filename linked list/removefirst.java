public class removefirst{
    public static class Node {
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
    public  void addfirst3(int data) {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public  void addlast3(int data)
    {
         Node newNode=new Node(data);
         if(head==null)
         {
            head=tail=newNode;
         }
         tail.next=newNode;
         tail=newNode;
    }

    public  void print() {
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
        System.out.println("null");
    }

    public  int removefirst3() {
        // if(head==tail)
        // {
        //     int val=head.data;
        //     head=tail=null;
        //     return val;
        // }
        // int val=head.data;
        // head=head.next;
        // return val;
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

    public static void main(String args[]) {
        removefirst ll=new removefirst();
        ll.print();
        ll.addfirst3(2);
        ll.print();
        ll.addlast3(3);
        ll.print();
        ll.addfirst3(5);
        ll.print();
        ll.addfirst3(4);
        ll.print();
        ll.removefirst3();
        ll.print();
        
    }
}