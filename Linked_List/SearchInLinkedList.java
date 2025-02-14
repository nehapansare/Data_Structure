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
public class SearchInLinkedList {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int key=5;
        Node head=createList(arr);
        boolean found=findKey(head, key);
        System.out.println(found);
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
    public static boolean findKey(Node head,int key)
    {
        while (head!=null) {
            if(head.data==key)
            {
                return true;
            }
            head=head.next;
        }
        return false;

    }
   
}
