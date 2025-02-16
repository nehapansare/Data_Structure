package Linked_List;

class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
        this.next=null;
    }
}
public class InsertionAtBeginDoubleLinkedList {
    public static void main(String[] args) {
        int[] arr={2,3,4};
        int x=1;
        Node head=createNode(arr);
        head=insertAtBegin(head,x);
        printList(head);
    }
    public static Node createNode(int[] arr)
    {
        Node head=new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++)
        {
            Node newNode=new Node(arr[i]);
            temp.next=newNode;
            newNode.prev=temp;
            temp=newNode;

        }
        return head;
    }
    public static Node insertAtBegin(Node head,int x)
    {
        Node newNode=new Node(x);
        newNode.next=head;
        head.prev=newNode;
         head=newNode;
         return newNode;
    }
    public static void printList(Node head)
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
  
}
