package Linked_List;

class Node{
    int data;
    Node prev;
    Node next;
    Node(int data)
    {
        this.prev=null;
        this.next=null;
        this.data=data;
    }
}
public class InsertionDoubleLinkedList {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int x=6;
        Node head=createList(arr);
        System.out.println("Original");
        printList(head);
        head=insertNode(head,x);
        printList(head);
    }
    public static Node createList(int arr[])
    {
        Node head=new Node(arr[0]);
        Node temp=head;
        for(int i=0;i<arr.length;i++)
        {
            Node newNode=new Node(arr[i]);
            temp.next=newNode;
            newNode.prev=temp;
            temp=newNode;
        }
        return head;
    }
    public static Node insertNode(Node head,int x)
    {
           Node newNode=new Node(x);
           if(head==null)
           {
              head=newNode;
              return head;
           }
           Node temp=head;
           while(temp.next!=null)
           {
            temp=temp.next;
           }
           temp.next=newNode;
      return head;
    }
    public static void printList(Node head)
    {
        Node temp=head;
       
        while(temp!=null)
        {
            System.out.println(temp.data+"<->");
            temp=temp.next;

        }
        System.out.println("null");
    }
}
