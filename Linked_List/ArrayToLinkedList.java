package Linked_List;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public class ArrayToLinkedList {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        
        Node head=new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++)
        {
            temp.next=new Node(arr[i]);
            temp=temp.next;
        }
       PrintList(head);


    }
    public static void PrintList(Node head)
    {
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
   
}
