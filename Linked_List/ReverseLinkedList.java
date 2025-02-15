package Linked_List;
class Node{
 int data;
 Node next;
 Node(int data){
    this.data=data;
    this.next=null;
 }
}
public class ReverseLinkedList {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        Node head=createList(arr);
        System.out.print("original :");
        printList(head);
        System.out.println();
        head=reverse(head);
        System.out.print("Reverse :");
        printList(head);
    }
    public static Node createList(int[] arr)
    {
        Node head=new Node(arr[0]);
        Node temp= head;
        for(int i=1;i<arr.length;i++)
        {
            temp.next=new Node(arr[i]);
            temp=temp.next;
        }
        return head;
    }
    public static Node reverse(Node head)
    {
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void printList(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");

    }
}
