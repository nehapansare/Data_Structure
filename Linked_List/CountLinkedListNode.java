package Linked_List;

class Node{
    Node next;
    int data;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class CountLinkedListNode {
    public static void main(String[] args) {
        int[] arr={};
        Node head=createList(arr);
        int count1=countList(head);
        System.out.println(count1);
    }
    public static Node createList(int[] arr)
    {
        if(arr.length==0)
        {
            return null;
        }
        Node head=new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++)
        {
            temp.next=new Node(arr[i]);
            temp=temp.next;
        }
        return head;
    }
    public static int countList(Node head)
    {
        int count=0;
        while(head!=null)
        {
            count++;
            head=head.next;
        }
        return count;
    }
}
