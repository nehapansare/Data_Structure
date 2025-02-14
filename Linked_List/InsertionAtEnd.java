package Linked_List;

class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class InsertionAtEnd {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int x=6;
        Node head= createList(arr);
        head=insertnodeEnd(head,x);
        printList(head);
    }
    public static Node createList(int[] arr)
    {
        Node head=new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++)
        {
            temp.next=new Node(arr[i]);
            temp=temp.next;
        }
        return head;
    }
    public static Node insertnodeEnd(Node head,int x)
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
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
    }

