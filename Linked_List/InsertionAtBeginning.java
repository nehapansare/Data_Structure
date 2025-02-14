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

public class InsertionAtBeginning {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
         int x=1;
       Node head=createList(arr);
       head=insertNode(head, x);
        printList(head);
    }
    public static Node createList(int[] arr)
    {
        if(arr.length==0)
        return null;
        Node head=new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++)
        {
            temp.next=new Node(arr[i]);
            temp=temp.next;
        }
        return head;

    }
    public static Node insertNode(Node head,int x)
    {
         Node newNode=new Node(x);
         newNode.next=head;
         head=newNode;
         return newNode;
    }
    public static void printList(Node head)
    {
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
    System.out.println("null");
     }
}



