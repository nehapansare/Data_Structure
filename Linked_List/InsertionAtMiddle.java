package Linked_List;

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }

}
public class InsertionAtMiddle {
    public static void main(String[] args) {
        int[] arr={1,2,4};
        int x=3;
        Node head=createList(arr);
        head=insertNodeMiddle(head,x);
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
    public static Node insertNodeMiddle(Node head,int x)
    {
        Node newNode=new Node(x);
        if(head==null)
        {
            return newNode;
        }
        Node slow=head;
        Node fast=head;
        while (fast!=null &&fast.next!=null&& fast.next.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            
        }
        newNode.next=slow.next;
        slow.next=newNode;
        return head;

    }
    public static void printList(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");

    }
}
