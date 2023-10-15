
public class addfirst {
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
        Node currNode=new Node(data);
        if(head==null){
            head=tail=currNode;
            return ;
        }
        currNode.next=head;
        head=currNode;
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
        if(head==null){
            System.out.println("LinkList are empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" > ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String args[]) {
        addfirst ll=new addfirst();
        // ll.print();
        // ll.addfirst1(2);
        // ll.print();
        // ll.addfirst1(3);
        // ll.print();
        // ll.addfirst1(5);
        // ll.print();
        // ll.addfirst1(4);
        // ll.print();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.addlast(6);
        ll.print();
        
    }
    public void removefirst1() {
    }
    public void removefirst2() {
    }
}
