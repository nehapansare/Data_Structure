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
public class DeleteNode {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int node=4;
        Node head=createList(arr);
        System.out.print("Original List: ");
        printList(head);
        head=deleteNode(head,node);
        System.out.print("List after deleting " + node + ": ");
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
    public static Node deleteNode(Node head,int node)
    {
       if(head==null)
       {
        return null;
       }
       if(head.data==node)
       {
        return head.next;
       }
       Node temp=head;
       while(temp.next!=null && temp.next.data!=node)
       {
        temp=temp.next;
       }
       if(temp.next!=null && temp.next.data==node)
       {
         temp.next=temp.next.next;
       }
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
